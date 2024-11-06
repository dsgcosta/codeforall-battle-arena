package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

// Rogue ability
public class Sneakattack extends AbstractAbility {

    public Sneakattack(int damage) {
        super(damage, 0); // Set damage and no healing power
    }

    @Override
    public void use(Hero caster, Hero target) {
        String casterName = caster.getName();
        String targetName = target.getName();

        System.out.println(casterName + " performs a sneak attack on " + targetName + ", dealing " + damage + " damage.");

        target.takeDamage(damage); // Uses damage instead of power
    }
}

