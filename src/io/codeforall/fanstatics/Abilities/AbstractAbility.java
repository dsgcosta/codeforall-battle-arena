package io.codeforall.fanstatics.Abilities;

import io.codeforall.fanstatics.heroes.Hero;

public abstract class AbstractAbility implements Ability{

    protected int power;

    public AbstractAbility(int power){
        this.power = power;
    }

    public int getPower(){
       return power;
    }

    public void use(Hero caster, Hero target){
        //System.out.println("Mage casts Fireball at " + target.getName() + " dealing " + power + " damage");
        target.takeDamage(power);
    }
}
