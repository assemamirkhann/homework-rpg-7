package com.narxoz.rpg.strategy;

public class WarriorStrategy implements CombatStrategy {

    public int calculateDamage(int basePower) {
        return basePower + 15;
    }
    public int calculateDefense(int baseDefense) {
        return baseDefense + 10;
    }
    public String getName() {
        return "Warrior Style";
    }
}