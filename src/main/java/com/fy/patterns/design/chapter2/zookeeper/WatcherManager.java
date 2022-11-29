package com.fy.patterns.design.chapter2.zookeeper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 真正的主题对象
 */
public class WatcherManager implements IWatchManager {

    /*
     * key：数据节点路径，value：客户端连接的集合
     * 有了这个结构，当节点有变动的时候我们可以直接从map里get出所有监听此节点的Watcher集合，然后for循环遍历逐个通知
     */
    private final HashMap<String, Set<Watcher>> watchTable = new HashMap<>();

    /*
     * 存储 Watcher 和 这个 Watcher 监听的所有 path
     * 有了这个结构，我们 Watcher 销毁的时候就能清除其监听的所有 path
     */
    private final HashMap<Watcher, Set<String>> watch2Paths = new HashMap<>();

    /*
     * 添加Watcher
     */
    @Override
    public synchronized boolean addWatch(String path, Watcher watcher) {
        // 对path添加Watcher
        Set<Watcher> list = watchTable.get(path);
        if (list == null) {
            list = new HashSet<>(4);
            watchTable.put(path, list);
        }
        list.add(watcher);

        // 该watcher下可监听多个path
        Set<String> paths = watch2Paths.get(watcher);
        if (paths == null) {
            paths = new HashSet<>();
            watch2Paths.put(watcher, paths);
        }
        return paths.add(path);
    }

    /*
     * 移除Watcher
     */
    @Override
    public synchronized void removeWatcher(Watcher watcher) {
        // 移除记录的该watcher监听的所有path
        Set<String> paths = watch2Paths.remove(watcher);
        if (paths == null) {
            return;
        }

        // 移除path被该watcher监听的记录
        for (String p : paths) {
            Set<Watcher> list = watchTable.get(p);
            if (list != null) {
                list.remove(watcher);
                if (list.isEmpty()) {
                    watchTable.remove(p);
                }
            }
        }
    }

    /*
     * 触发Watcher
     */
    @Override
    public void triggerWatch(String path, EventType type) {
        for (Watcher watcher : watchTable.get(path)) {
            watcher.process(type);
        }
    }
}
