package com.fy.patterns.design.chapter7.command;

/**
 * 命令的接口
 */
public interface Command {

    void execute();

    /**
     * 执行命令相反的逻辑
     */
    void undo();
}
