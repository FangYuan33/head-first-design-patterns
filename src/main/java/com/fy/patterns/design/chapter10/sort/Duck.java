package com.fy.patterns.design.chapter10.sort;

public class Duck implements Comparable<Duck> {

    private final Integer age;

    public Duck(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Duck other) {
        return this.age.compareTo(other.getAge());
    }
}
