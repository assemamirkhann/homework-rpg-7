package com.narxoz.rpg;

import com.narxoz.rpg.arena.*;
import com.narxoz.rpg.boss.DungeonBoss;
import com.narxoz.rpg.engine.DungeonEngine;
import com.narxoz.rpg.observer.*;
import com.narxoz.rpg.strategy.*;

/**
 * Entry point for Homework 7 — The Cursed Dungeon: Boss Encounter System.
 *
 * Build your heroes, boss, observers, and engine here, then run the encounter.
 */
public class Main {

    public static void main(String[] args) {
        // TODO (student): Create at least 3 heroes with different combat strategies
        // TODO (student): Create a DungeonBoss with meaningful stats
        // TODO (student): Instantiate and register all 5 observers
        // TODO (student): Create a DungeonEngine and run the encounter
        // TODO (student): Print the EncounterResult at the end

        CombatStrategy warriorStrategy = new WarriorStrategy();
        CombatStrategy mageStrategy = new MageStrategy();
        CombatStrategy rogueStrategy = new RogueStrategy();

        Hero warrior = new Hero("Warrior", 120, 25, 10, warriorStrategy);
        Hero mage = new Hero("Mage", 80, 40, 5, mageStrategy);
        Hero rogue = new Hero("Rogue", 90, 30, 8, rogueStrategy);

        DungeonBoss boss = new DungeonBoss("Cursed Dragon", 500, 35, 20);

        DungeonEngine engine = new DungeonEngine();

        engine.addObserver(new BattleLogObserver());
        engine.addObserver(new HealthMonitorObserver());
        engine.addObserver(new CriticalHitObserver());
        engine.addObserver(new BossPhaseObserver());
        engine.addObserver(new VictoryDefeatObserver());

        EncounterResult result = engine.runEncounter(
                new Hero[]{warrior, mage, rogue},
                boss
        );

        System.out.println("\n=== ENCOUNTER RESULT ===");
        System.out.println(result);
            }
        }
