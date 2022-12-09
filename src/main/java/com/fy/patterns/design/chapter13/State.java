package com.fy.patterns.design.chapter13;

public interface State {

    /**
     * 放入25
     */
    void insertQuarter();

    /**
     * 退钱！
     */
    void ejectQuarter();

    /**
     * 转出糖果
     */
    void turnCrank();

    /**
     * 糖果机吐出糖果
     */
    void dispense();
}
