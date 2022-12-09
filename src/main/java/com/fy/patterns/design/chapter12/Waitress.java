package com.fy.patterns.design.chapter12;

import java.util.Iterator;

public class Waitress {

    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void print() {
        menuComponent.print();
    }

    public void printInclude1() {
        Iterator<MenuComponent> iterator = menuComponent.iterator();

        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();

            if (next.getName().contains("1")) {
                next.print();
            }
        }
    }
}
