package com.fy.patterns.design.chapter13;

/**
 * 卖光了状态
 */
public class SoldOutState implements State {

    @Override
    public void insertQuarter() {
        System.out.println("打烊了！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("都说了打烊了！");
    }

    @Override
    public void turnCrank() {
        System.out.println("再弄！再弄你给弄坏了！");
    }

    @Override
    public void dispense() {
        System.out.println("你还能看见里边儿有糖果？");
    }
}
