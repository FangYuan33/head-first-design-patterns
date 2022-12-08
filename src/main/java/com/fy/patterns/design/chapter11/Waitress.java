package com.fy.patterns.design.chapter11;

import java.util.Iterator;

public class Waitress {

    private Iterable<MenuItem> dinnerMenu;
    private Iterable<MenuItem> pancakeHouseMenu;

    public Waitress(Iterable<MenuItem> dinnerMenu, Iterable<MenuItem> pancakeHouseMenu) {
        this.dinnerMenu = dinnerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        System.out.println("One!");
        printMenu(dinnerMenu.iterator());
        System.out.println("Two!");
        printMenu(pancakeHouseMenu.iterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem next = iterator.next();
            System.out.println(next.getName());
        }
    }
}
