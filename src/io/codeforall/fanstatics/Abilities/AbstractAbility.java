package io.codeforall.fanstatics.Abilities;

public abstract class AbstractAbility implements Ability {
    protected int damage;
    protected int healingPower;

    public AbstractAbility(int damage, int healingPower) {
        this.damage = damage;
        this.healingPower = healingPower;
    }
}
