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
        int damageTaken = Math.max(0, damage - defense); // Ensure damage is at least 0
        health -= damageTaken; // Apply damage reduction by defense
        health = Math.max(0, health); // Ensure health doesn’t fall below zero

        if (damageTaken > 0) {
            System.out.println(name + " takes " + damageTaken + " damage (Defense: " + defense + "), health is now: " + health);
        } else {
            System.out.println(name + " is fully protected and takes no damage!");
        }
    }



    public void increaseHealth(int amount) {
        health += amount;
        System.out.println(name + " gains " + amount + " health, now at: " + health);
    }

    public void restoreHealth(int amount) {
        health += amount;
        System.out.println(name + " gains " + amount + " health, now at: " + health);
    }

}
