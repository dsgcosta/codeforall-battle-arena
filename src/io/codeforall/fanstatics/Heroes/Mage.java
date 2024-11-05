package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Fireball;

// hability: fireball
public class Mage extends Hero{
    public Mage(String name, int defense,  int health, int fireballPower) {
        super(name, defense, health);
        this.ability = new Fireball(fireballPower);
    }
}
