package com.fy.patterns.design.chapter5.abstractfactory.store;


import com.fy.patterns.design.chapter5.abstractfactory.pizza.Pizza;

/**
 * 工厂方法模式下的披萨商店
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        // 售卖披萨相关的方法
        pizza.prepare();
        pizza.box();

        return pizza;
    }

    /**
     * 工厂方法
     */
    protected abstract Pizza createPizza(String type);
}
