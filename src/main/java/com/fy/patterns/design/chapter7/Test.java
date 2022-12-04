package com.fy.patterns.design.chapter7;

import com.fy.patterns.design.chapter7.command.Command;
import com.fy.patterns.design.chapter7.command.impl.LightOffCommand;
import com.fy.patterns.design.chapter7.command.impl.LightOnCommand;
import com.fy.patterns.design.chapter7.invoker.SimpleRemoteControl;
import com.fy.patterns.design.chapter7.receiver.Light;

public class Test {
    public static void main(String[] args) {
        // 开灯、关灯的命令，封装了命令的执行者: 电灯
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);


        // 调用者遥控器来指定执行的命令
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(lightOffCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
