package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Sneakattack;

// hability: sneakattack
public class Rogue extends Hero{
    public Rogue(String name, int defense, int health, int sneakPower) {
        super(name, defense, health);
        this.ability = new Sneakattack(sneakPower);
    }


}
