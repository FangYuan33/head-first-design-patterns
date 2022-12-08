package com.fy.patterns.design.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Iterable<MenuItem> {
    private final ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Milk"));
        menuItems.add(new MenuItem("Apple"));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
