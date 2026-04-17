package com.narxoz.rpg.strategy;

public class MageStrategy implements CombatStrategy {

    public int calculateDamage(int basePower) {
        return basePower + 25;
    }

    public int calculateDefense(int baseDefense) {
        return baseDefense - 2;
    }

    public String getName() {
        return "Mage Style";
    }
}