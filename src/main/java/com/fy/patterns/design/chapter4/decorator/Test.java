package com.fy.patterns.design.chapter4.decorator;

public class Test {
    public static void main(String[] args) {
        Water water = new Water();

        YangZhi yangZhi = new YangZhi();
        GanLu ganLu = new GanLu();

        ganLu.setBeverage(water);
        yangZhi.setBeverage(ganLu);

        System.out.println(yangZhi.getDescription());
        System.out.println(yangZhi.cost() + "元");
    }
}
