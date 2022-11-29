package com.fy.patterns.design.chapter2.zookeeper;

/**
 * 观察者
 */
public interface Watcher {
    void process(EventType event);
}
