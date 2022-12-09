package com.fy.patterns.design.chapter13;

/**
 * 售出糖果状态
 */
public class SoldState implements State {

    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("等会儿再买下一个");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("花出去的钱不给了");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖在路上");
    }

    @Override
    public void dispense() {
        machine.release();
        if (machine.getCount() <= 0) {
            machine.setCurrentState(machine.getSoldOutState());
            System.out.println("卖光了！");
        } else {
            machine.setCurrentState(machine.getNoQuarterState());
            System.out.println("下一位！");
        }
    }
}
