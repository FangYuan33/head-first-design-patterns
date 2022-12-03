package com.fy.patterns.design.chapter5.simple;

import com.fy.patterns.design.chapter5.*;

/**
 * 简单工厂下的披萨商店
 */
public class PizzaStore {

    private final SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaStore) {
        this.simplePizzaFactory = simplePizzaStore;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
//        if ("CB".equals(type)) {
//            pizza = new ChinaBigPizza();
//        } else if ("CS".equals(type)) {
//            pizza = new ChinaSmallPizza();
//        } else if ("UB".equals(type)) {
//            pizza = new UKBigPizza();
//        } else if ("US".equals(type)) {
//            pizza = new UKSmallPizza();
//        } else {
//            throw new RuntimeException("无对应披萨");
//        }

        // 售卖披萨相关的方法
        pizza.prepare();
        pizza.box();

        return pizza;
    }
}
