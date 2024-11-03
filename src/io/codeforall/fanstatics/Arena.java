package io.codeforall.fanstatics;

import io.codeforall.fanstatics.heroes.Hero;
import io.codeforall.fanstatics.heroes.Warrior;
import io.codeforall.fanstatics.heroes.Mage;

import java.sql.SQLOutput;

public class Arena {
    private Hero[] heroes;

    // Initializes the Arena with given number of heroes
    public Arena(int numHeroes){
        heroes = new Hero[numHeroes];
    }

    public void initializeHeroes(){
        if (heroes.length >= 2){
            heroes[0] = new Warrior("warrior", 100);
            heroes[1] = new Mage("mage", 80, 20);

        }
    }

    public void displayHeroes(){
        for (Hero hero : heroes) {
            if(hero != null){
                System.out.println("Hero name: " + hero.getName() + "\nhealth: " + hero.getHealth());
                System.out.println("--------------------------------------");
            }
        }
    }

    public void useHeroAbilities() {
        for (Hero hero : heroes) {
            if (hero != null) {
                System.out.println("Hero name: " + hero.getName() + " health: " + hero.getHealth());
                hero.useAbility(); // Calls the useAbility() method for each hero
            }
        }
    }
}
