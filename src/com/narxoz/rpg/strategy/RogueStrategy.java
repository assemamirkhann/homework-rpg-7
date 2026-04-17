package com.narxoz.rpg.strategy;

import java.util.Random;

public class RogueStrategy implements CombatStrategy {

    private final Random random = new Random();
    public int calculateDamage(int basePower) {
        boolean crit = random.nextDouble() < 0.3;
        return crit ? basePower * 2 : (int)(basePower * 1.3);
    }
    public int calculateDefense(int baseDefense) {
        return baseDefense + 5;
    }
    public String getName() {
        return "Rogue Style";
    }
}