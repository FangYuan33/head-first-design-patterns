package com.fy.patterns.design.chapter10.sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Duck[] ducks = new Duck[] {new Duck(1), new Duck(9), new Duck(3)};

        Arrays.sort(ducks);

        for (Duck duck : ducks) {
            System.out.println(duck.getAge());
        }
    }
}
