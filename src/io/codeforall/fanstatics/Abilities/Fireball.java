package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

// mage ability
public class Fireball extends AbstractAbility{

    public Fireball(int power) {
        super(power);
    }

    @Override
    public void use(Hero caster, Hero target) {

        String casterName = caster.getName();
        String targetName = target.getName();

        System.out.println(casterName + " casting fireball at " + targetName + " with power: " + power);

        target.takeDamage(power);
    }
}
