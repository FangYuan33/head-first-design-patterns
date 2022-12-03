package com.fy.patterns.design.chapter2.behavior;

/**
 * 弓箭武器行为，算法族之一
 *
 * @author FangYuan
 * @since 2022-11-28 20:38:47
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("弓箭射杀！");
    }
}
