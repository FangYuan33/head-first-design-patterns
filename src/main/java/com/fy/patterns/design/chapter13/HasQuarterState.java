package com.fy.patterns.design.chapter13;

/**
 * 已投币状态
 */
public class HasQuarterState implements State {

    private GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("知道你有钱了，别塞了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("期待你下次能花钱");
        machine.setCurrentState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("稍等！糖马上来！");
        if (System.currentTimeMillis() % 2 == 0) {
            machine.setCurrentState(machine.getSoldState());
        } else {
            machine.setCurrentState(machine.getWinnerState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("等会儿给！");
    }
}
