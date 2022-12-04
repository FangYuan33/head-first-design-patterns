package com.fy.patterns.design.chapter7.invoker;

import com.fy.patterns.design.chapter7.command.Command;

public class SimpleRemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按钮被按下，执行命令对象的方法
     */
    public void buttonWasPressed() {
        command.execute();
    }
}
