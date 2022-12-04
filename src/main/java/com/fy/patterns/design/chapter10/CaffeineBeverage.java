package com.fy.patterns.design.chapter10;

/**
 * 咖啡因饮料
 */
public abstract class CaffeineBeverage {

    /**
     * 准备一份饮料的模板方法，定义了步骤
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 冲泡
     */
    protected abstract void brew();

    private void pourInCup() {
        System.out.println("倒杯子里儿");
    }

    /**
     * 加点儿料
     */
    protected abstract void addCondiments();
}
