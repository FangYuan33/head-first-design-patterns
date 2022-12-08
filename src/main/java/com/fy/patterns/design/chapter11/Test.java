package com.fy.patterns.design.chapter11;

public class Test {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(dinnerMenu, pancakeHouseMenu);
        waitress.printMenu();
    }
}
