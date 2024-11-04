package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Shieldblock;

// hability: shieldblock
public class Warrior extends Hero {
    public Warrior(String name, int health, int shieldPower) {
        super(name, health);
        this.ability = new Shieldblock(shieldPower);
    }
}
