package io.codeforall.fanstatics.heroes;

import io.codeforall.fanstatics.Abilities.Fireball;

// hability: fireball
public class Mage extends Hero{
    public Mage(String name, int health, int fireballPower) {
        super(name, health);
        this.ability = new Fireball(fireballPower);
    }
}
