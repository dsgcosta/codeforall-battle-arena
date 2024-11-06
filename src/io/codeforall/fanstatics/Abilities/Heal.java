package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.Heroes.Hero;

// Cleric hability
public class Heal extends AbstractAbility {

    public Heal(int healingPower) {
        super(0, healingPower); // 0 damage, only healing power
    }

    @Override
    public void use(Hero caster, Hero target) {
        String casterName = caster.getName();
        System.out.println(casterName + " heals themselves with power: " + healingPower);

        target.restoreHealth(healingPower);
    }
}
