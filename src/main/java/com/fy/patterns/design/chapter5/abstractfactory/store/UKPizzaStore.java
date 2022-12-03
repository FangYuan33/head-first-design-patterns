package com.fy.patterns.design.chapter5.abstractfactory.store;

import com.fy.patterns.design.chapter5.abstractfactory.pizza.Pizza;
import com.fy.patterns.design.chapter5.abstractfactory.pizza.UKBigPizza;
import com.fy.patterns.design.chapter5.abstractfactory.pizza.UKSmallPizza;

public class UKPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;

        if ("UB".equals(type)) {
            pizza = new UKBigPizza();
        } else if ("US".equals(type)) {
            pizza = new UKSmallPizza();
        } else {
            throw new RuntimeException("请重新点！");
        }

        return pizza;
    }
}
