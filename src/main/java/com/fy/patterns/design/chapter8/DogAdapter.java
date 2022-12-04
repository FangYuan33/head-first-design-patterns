package com.fy.patterns.design.chapter8;

public class DogAdapter implements Duck {

    private final BeautifulDog dog;

    public DogAdapter(BeautifulDog dog) {
        this.dog = dog;
    }

    @Override
    public void quack() {
        dog.bark();
    }
}
