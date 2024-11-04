package io.codeforall.fanstatics;
// increase defesa
// fireball danos
// heal aumenta vida do cleric
// sneakattack dano a dobrar

public class Main {
    public static void main(String[] args) {

        Arena arena = new Arena(2);
        arena.initializeHeroes();
        arena.displayHeroes();
        arena.battle();

        TurnManager turnManager = new TurnManager(arena.getHeroes()[0], arena.getHeroes()[1]);

        turnManager.startBattle();
    }
}