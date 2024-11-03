package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.heroes.Hero;

// warrior ability
public class Shieldblock extends AbstractAbility{
    public Shieldblock(int power) {
        super(power);
    }

    @Override
    public void use(Hero caster, Hero target) {
        String casterName = caster.getName();
        String targetName = target.getName();

        System.out.println(casterName + " casting fireball at " + targetName + " with power: " + power);
    }
}
