package com.fy.patterns.design.chapter11;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

    private Integer iteratorPosition = 0;

    private final MenuItem[] menuItems;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return iteratorPosition < menuItems.length;
    }

    @Override
    public MenuItem next() {
        return menuItems[iteratorPosition++];
    }

    @Override
    public void remove() {
        if (iteratorPosition <= 0 || iteratorPosition > menuItems.length) {
            throw new IllegalStateException("操作异常");
        }

        if (menuItems[iteratorPosition - 1] != null) {
            // 把后边的每一个数都往前挪一个
            for (int i = iteratorPosition - 1; i < menuItems.length - 1; i++) {
                menuItems[i] = menuItems[i + 1];
            }
            // 最后一个挪不到的数置空
            menuItems[menuItems.length - 1] = null;
        }

    }
}
