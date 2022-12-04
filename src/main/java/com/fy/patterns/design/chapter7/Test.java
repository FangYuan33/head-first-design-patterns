package com.fy.patterns.design.chapter7;

import com.fy.patterns.design.chapter7.command.Command;
import com.fy.patterns.design.chapter7.command.impl.LightOffCommand;
import com.fy.patterns.design.chapter7.command.impl.LightOnCommand;
import com.fy.patterns.design.chapter7.command.impl.PartyCommand;
import com.fy.patterns.design.chapter7.command.impl.TVOnCommand;
import com.fy.patterns.design.chapter7.invoker.SimpleRemoteControl;
import com.fy.patterns.design.chapter7.receiver.Light;
import com.fy.patterns.design.chapter7.receiver.TV;

import java.util.Arrays;
import java.util.List;

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

        System.out.println("------------");

        simpleRemoteControl.undoButtonPressed();

        System.out.println("---测试宏命令---");
        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        List<Command> commandList = Arrays.asList(lightOnCommand, tvOnCommand);
        PartyCommand partyCommand = new PartyCommand(commandList);

        simpleRemoteControl.setCommand(partyCommand);
        partyCommand.execute();
    }
}
