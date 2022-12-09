package com.fy.patterns.design.chapter12;

public class Test {
    public static void main(String[] args) {
        MenuComponent a = new Menu("a");
        MenuComponent b = new Menu("b");

        a.add(new MenuItem("a1"));
        a.add(new MenuItem("a2"));
        a.add(b);
        b.add(new MenuItem("b1"));
        b.add(new MenuItem("b2"));

        Waitress waitress = new Waitress(a);

//        waitress.print();
        waitress.printInclude1();
    }
}
