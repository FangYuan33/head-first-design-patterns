package com.fy.patterns.design.chapter2;

import com.fy.patterns.design.chapter2.behavior.BowAndArrowBehavior;
import com.fy.patterns.design.chapter2.behavior.KnifeBehavior;
import com.fy.patterns.design.chapter2.character.Character;
import com.fy.patterns.design.chapter2.character.King;
import com.fy.patterns.design.chapter2.character.Knight;

public class Test {
    public static void main(String[] args) {
        // 算法族，不同的武器行为
        KnifeBehavior knifeBehavior = new KnifeBehavior();
        BowAndArrowBehavior bowAndArrowBehavior = new BowAndArrowBehavior();

        Character knight = new Knight();
        knight.fight();
        knight.setWeaponBehavior(bowAndArrowBehavior);
        knight.fight();

        Character king = new King();
        king.fight();
        king.setWeaponBehavior(knifeBehavior);
        king.fight();
    }
}
