package com.fy.patterns.design.chapter2.character;

import com.fy.patterns.design.chapter2.behavior.WeaponBehavior;

/**
 * 角色抽象类，被具体角色继承
 *
 * @author FangYuan
 * @since 2022-11-28 20:33:21
 */
public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        if (weaponBehavior != null) {
            weaponBehavior.useWeapon();
        } else {
            System.out.println("赤手空拳！");
        }
    }
}
