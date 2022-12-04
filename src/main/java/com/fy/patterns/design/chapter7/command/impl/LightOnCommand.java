package com.fy.patterns.design.chapter7.command.impl;

import com.fy.patterns.design.chapter7.command.Command;
import com.fy.patterns.design.chapter7.receiver.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
