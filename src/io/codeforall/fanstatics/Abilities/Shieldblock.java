package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

// warrior ability
public class Shieldblock extends AbstractAbility{
    public Shieldblock(int power) {
        super(power);
    }

    @Override
    public void use(Hero caster, Hero target) {
        String casterName = caster.getName();
        String targetName = target.getName();

        caster.increaseHealth(power);

        System.out.println(casterName + " raises a shield " + targetName + " with power: " + power);
    }
}
