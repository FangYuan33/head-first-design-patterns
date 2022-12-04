package com.fy.patterns.design.chapter7.command.impl;

import com.fy.patterns.design.chapter7.command.Command;

import java.util.List;

/**
 * 宏命令
 */
public class PartyCommand implements Command {

    private final List<Command> commandList;

    public PartyCommand(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commandList) {
            command.undo();
        }
    }
}
