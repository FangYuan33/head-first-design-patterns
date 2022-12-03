package com.fy.patterns.design.chapter5.simple;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza("CB");
    }
}
