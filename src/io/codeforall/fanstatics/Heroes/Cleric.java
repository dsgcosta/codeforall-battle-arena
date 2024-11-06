package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Heal;

// hability heal
public class Cleric extends Hero{
    public Cleric(String name, int defense, int health, int healPower) {
        super(name, defense, health);
        this.ability = new Heal(healPower);
    }
}
