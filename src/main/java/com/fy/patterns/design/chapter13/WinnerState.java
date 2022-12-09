package com.fy.patterns.design.chapter13;

public class WinnerState implements State {

    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("有惊喜！再等一会儿");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("哎呀，这次钱超值的");
    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        System.out.println("正在了！正在了!两个！大概！");
        machine.release();
        machine.release();
        if (machine.getCount() <= 0) {
            System.out.println("卖光了！！！");
            machine.setCurrentState(machine.getSoldOutState());
        } else {
            machine.setCurrentState(machine.getNoQuarterState());
            System.out.println("下一位！");
        }
    }
}
