package com.fy.patterns.design.chapter5;

/**
 * 产品的抽象类
 * 披萨 - 准备 和 装箱 抽象方法由子类去做具体的实现
 */
public abstract class Pizza {

    public abstract void prepare();

    public abstract void box();
}
