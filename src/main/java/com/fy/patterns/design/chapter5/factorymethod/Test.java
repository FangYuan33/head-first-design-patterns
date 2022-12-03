package com.fy.patterns.design.chapter5.factorymethod;

public class Test {
    public static void main(String[] args) {
        PizzaStore ukPizzaStore = new UKPizzaStore();
        ukPizzaStore.orderPizza("UB");
    }
}
