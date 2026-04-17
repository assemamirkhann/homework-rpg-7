package com.narxoz.rpg.combatant;

public class DungeonBoss {
    private String name;
    private int hp;
    private int attack;
    private int defense;

    public DungeonBoss(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }

    public void takeDamage(int damage) {
        hp -= Math.max(0, damage - defense);
    }

    public int attack() {
        return attack;
    }

    public boolean isAlive() {
        return hp > 0;
    }
}