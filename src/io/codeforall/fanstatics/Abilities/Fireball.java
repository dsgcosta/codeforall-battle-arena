package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

// mage ability
public class Fireball extends AbstractAbility {

    public Fireball(int damage) {
        super(damage, 0); // Set damage and no healing power
    }

    @Override
    public void use(Hero caster, Hero target) {
        String casterName = caster.getName();
        String targetName = target.getName();

        System.out.println(casterName + " casts Fireball at " + targetName + ", dealing " + damage + " damage.");

        target.takeDamage(damage);
    }
}

