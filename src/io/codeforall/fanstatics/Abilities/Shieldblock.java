package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

// warrior ability
public class Shieldblock extends AbstractAbility {

    public Shieldblock(int healingPower) {
        super(0, healingPower); // Only healing, no damage
    }

    @Override
    public void use(Hero caster, Hero target) {
        String casterName = caster.getName();
        caster.increaseHealth(healingPower); // Increase the caster's health

        System.out.println(casterName + " raises a shield and restores " + healingPower + " health.");
    }
}
