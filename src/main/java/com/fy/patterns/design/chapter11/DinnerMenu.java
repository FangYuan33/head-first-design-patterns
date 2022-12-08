package com.fy.patterns.design.chapter11;

import java.util.Iterator;

public class DinnerMenu implements Iterable<MenuItem> {

    private final int MAX = 2;

    private final MenuItem[] menuItems;

    public DinnerMenu() {
        this.menuItems = new MenuItem[MAX];

        menuItems[0] = new MenuItem("Chicken");
        menuItems[1] = new MenuItem("Beef");
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
