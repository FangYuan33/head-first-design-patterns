package com.fy.patterns.design.chapter2.zookeeper;

/**
 * 主题接口，zookeeper叫IWatchManager
 * 我觉得这个名字更加贴切，把很多观察者保存下来管理
 */
public interface IWatchManager {

    boolean addWatch(String path, Watcher watcher);

    void removeWatcher(Watcher watcher);

    void triggerWatch(String path, EventType type);
}
