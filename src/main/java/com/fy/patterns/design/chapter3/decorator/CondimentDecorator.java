package com.fy.patterns.design.chapter3.decorator;

/**
 * 调味料装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 被装饰的对象
     */
    protected Beverage beverage;

    /**
     * 指定被装饰者
     */
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
