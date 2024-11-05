package io.codeforall.fanstatics.Heroes;

import io.codeforall.fanstatics.Abilities.Ability;

public abstract class Hero {

    private String name;
    private int health;
    private int defense;
    public Ability ability;


    public Hero(String name, int defense, int health) {
        this.name = name;
        this.defense = defense;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDefense(){
        return defense;
    }


    public void useAbility(Hero target) {
        if (ability != null) {
            ability.use(this, target);
        } else {
            System.out.println(name + " has no ability to use!");
        }
    }

    public void takeDamage(int damage) {
        int damageTaken = damage - defense;
        health -= damageTaken;
        System.out.println(name + " takes " + damageTaken + " damage (Defense: " + defense + "), health is now: " + health);
    }

    public void increaseHealth(int amount) {
        health += amount;
        System.out.println(name + "'s health increased by " + amount + ". Health is now: " + health);
    }

}
