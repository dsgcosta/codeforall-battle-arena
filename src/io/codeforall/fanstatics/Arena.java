package io.codeforall.fanstatics;

import io.codeforall.fanstatics.heroes.Hero;
import io.codeforall.fanstatics.heroes.Warrior;
import io.codeforall.fanstatics.heroes.Mage;


public class Arena {
    private Hero[] heroes;

    // Initializes the Arena with given number of heroes
    public Arena(int numHeroes){
        heroes = new Hero[numHeroes];
    }

    public void initializeHeroes(){
        if (heroes.length >= 2){
            heroes[0] = new Warrior("[warrior]", 100, 25);
            heroes[1] = new Mage("[mage]", 80, 20);

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

    public void battle() {
        // Mage uses Fireball on Warrior
        if (heroes[1] instanceof Mage && heroes[0] != null) {
            heroes[1].useAbility(heroes[0]); // Mage casts Fireball on Warrior
        }
    }
}
