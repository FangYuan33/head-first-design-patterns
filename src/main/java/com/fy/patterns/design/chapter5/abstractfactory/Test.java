package com.fy.patterns.design.chapter5.abstractfactory;

import com.fy.patterns.design.chapter5.abstractfactory.store.ChinaPizzaStore;
import com.fy.patterns.design.chapter5.abstractfactory.store.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChinaPizzaStore();

        pizzaStore.orderPizza("CB");
    }
}
