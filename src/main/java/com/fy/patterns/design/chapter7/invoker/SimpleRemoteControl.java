package com.fy.patterns.design.chapter7.invoker;

import com.fy.patterns.design.chapter7.command.Command;

public class SimpleRemoteControl {

    private Command command;

    /**
     * 记录上一条命令
     */
    private Command previousCommand;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按钮被按下，执行命令对象的方法
     */
    public void buttonWasPressed() {
        command.execute();
        previousCommand = command;
    }

    /**
     * 取消上次按钮的命令
     */
    public void undoButtonPressed() {
        if (previousCommand != null) {
            previousCommand.undo();
        }
    }
}
