package com.fy.patterns.design.chapter1.behavior;

/**
 * 匕首武器行为，算法族之一
 *
 * @author FangYuan
 * @since 2022-11-28 20:36:56
 */
public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("匕首刺杀！");
    }
}
