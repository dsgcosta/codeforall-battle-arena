package io.codeforall.fanstatics.Abilities;

public abstract class AbstractAbility implements Ability{

    protected int power;

    public AbstractAbility(int power){
        this.power = power;
    }

    public int getPower(){
       return power;
    }

    public void use() {
    }
}
