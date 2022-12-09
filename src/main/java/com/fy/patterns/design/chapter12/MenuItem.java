package com.fy.patterns.design.chapter12;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("MenuItemName: " + name);
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new NullIterator();
    }
}
