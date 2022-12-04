package com.fy.patterns.design.chapter10;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("冲咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖");
    }

    @Override
    protected boolean needCondiments() {
        return false;
    }
}
