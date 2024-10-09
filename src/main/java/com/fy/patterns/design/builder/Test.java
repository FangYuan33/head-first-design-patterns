package com.fy.patterns.design.builder;

public class Test {

    public static void main(String[] args) {
        ComputerProduct.Builder builder = new ComputerProduct.Builder();
        Director director = new Director(builder);
        ComputerProduct computerProduct = director.highPerformancePC();

        System.out.println(computerProduct);
    }

}
