package com.fy.patterns.design.chapter3.zookeeper;

public enum EventType {
    // Watcher 监听的数据节点被创建时
    NodeCreated(1),
    // Watcher 监听的数据节点被删除时
    NodeDeleted(2),
    // Watcher 监听的数据节点内容发生变更时（无论内容数据是否变化）
    NodeDataChanged(3),
    // Watcher监听的数据节点的子节点列表发生变更时
    NodeChildrenChanged(4);

    private final Integer value;

    EventType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
