package com.fy.patterns.design.chapter13;

/**
 * 待投币状态
 */
public class NoQuarterState implements State {

    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("ok，谢谢你的钱");
        machine.setCurrentState(machine.getQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没钱退啥！");
    }

    @Override
    public void turnCrank() {
        System.out.println("掏钱！");
    }

    @Override
    public void dispense() {
        System.out.println("说了！掏钱！");
    }
}
