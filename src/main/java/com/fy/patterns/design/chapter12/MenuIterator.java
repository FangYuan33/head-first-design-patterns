package com.fy.patterns.design.chapter12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MenuIterator implements Iterator<MenuComponent> {

    /**
     * 用队列来保存迭代器，这样一个迭代器用完后可以接着用其他的迭代器迭代
     * 保证所有的元素都被遍历到
     */
    private final Queue<Iterator<MenuComponent>> queue;

    public MenuIterator(Iterator<MenuComponent> iterator) {
        this.queue = new LinkedList<>();
        queue.offer(iterator);
    }

    @Override
    public boolean hasNext() {
        if (queue.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = queue.peek();
            if (!iterator.hasNext()) {
                queue.poll();

                return hasNext();
            } else {
                return true;
            }
        }
    }

    @SuppressWarnings("all")
    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = queue.peek();

            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof Menu) {
                queue.offer(menuComponent.iterator());
            }

            return menuComponent;
        } else {
            return null;
        }
    }
}
