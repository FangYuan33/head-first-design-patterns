package com.fy.patterns.design.chapter7.command.impl;

import com.fy.patterns.design.chapter7.command.Command;
import com.fy.patterns.design.chapter7.receiver.TV;

public class TVOnCommand implements Command {

    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
