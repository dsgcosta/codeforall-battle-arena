package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Heroes.*;

import java.util.Arrays;
import java.util.List;

public class Arena {
    private List<Hero> heroes;

    public Arena() {
        initializeHeroes();
    }

    private void initializeHeroes() {
        heroes = Arrays.asList(
                new Warrior("Warrior", 100, 10, 5),
                new Mage("Mage", 80, 20, 10),
                new Cleric("Cleric", 70, 15, 8),
                new Rogue("Rogue", 60, 12, 4)
        );
    }

    public void startBattle() {
        TurnManager turnManager = new TurnManager(heroes);
        turnManager.startBattle();
    }
}
