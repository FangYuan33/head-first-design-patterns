package com.fy.patterns.design.chapter6.hungry;

/**
 * 饿汉式单例模式
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
