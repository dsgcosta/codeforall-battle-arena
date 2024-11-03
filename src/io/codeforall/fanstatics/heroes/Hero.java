package io.codeforall.fanstatics.heroes;

import io.codeforall.fanstatics.Abilities.Ability;

public abstract class Hero {

    private String name;
    private int health;
    public Ability ability;


    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public void useAbility() {
        if (ability != null) {
            ability.use();
        } else {
            System.out.println(name + " has no ability to use!");
        }
    }
}
