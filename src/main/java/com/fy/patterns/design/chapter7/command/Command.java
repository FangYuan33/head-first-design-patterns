package com.fy.patterns.design.chapter7.command;

/**
 * 命令的接口
 */
public interface Command {

    void execute();

    /**
     * 撤销操作
     */
    void undo();

    /**
     * 重做操作
     */
    void redo();
}
