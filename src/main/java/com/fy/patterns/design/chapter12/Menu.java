package com.fy.patterns.design.chapter12;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    private String name;

    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("MenuName: " + name);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new MenuIterator(menuComponents.iterator());
    }
}
