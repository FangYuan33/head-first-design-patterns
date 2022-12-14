package com.fy.patterns.design.chapter2.character;

import com.fy.patterns.design.chapter2.behavior.KnifeBehavior;

/**
 * 骑士！
 *
 * @author FangYuan
 * 2022-11-28 20:39:47
 */
public class Knight extends Character {
    public Knight() {
        this.weaponBehavior = new KnifeBehavior();
    }
}
