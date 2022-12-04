package com.fy.patterns.design.chapter8;

public class Test {
    public static void main(String[] args) {
        Duck duck = new BeautifulDuck();
        duck.quack();

        // 狗适配器
        Duck dogAdapter = new DogAdapter(new BeautifulDog());
        dogAdapter.quack();
    }
}
