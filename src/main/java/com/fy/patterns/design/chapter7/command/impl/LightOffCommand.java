package com.fy.patterns.design.chapter7.command.impl;

import com.fy.patterns.design.chapter7.command.Command;
import com.fy.patterns.design.chapter7.receiver.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }

    @Override
    public void undo() {
        light.lightOn();
    }

    @Override
    public void redo() {

    }
}
