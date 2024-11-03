package io.codeforall.fanstatics.Abilities;

public class Fireball extends AbstractAbility{

    public Fireball(int power) {
        super(power);
    }

    @Override
    public void use() {
        System.out.println("Casting firebal with power: " + power);
    }
}
