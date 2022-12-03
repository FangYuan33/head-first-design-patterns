package com.fy.patterns.design.chapter6.lazy;

/**
 * 懒汉式单例模式
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
