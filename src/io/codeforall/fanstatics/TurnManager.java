package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Heroes.Hero;

public class TurnManager {
    private Hero hero1;
    private Hero hero2;

    public TurnManager(Hero hero1, Hero hero2){
        this.hero1 = hero1;
        this.hero2 = hero2;
    }

    public void startBattle(){
        int round = 1;
        System.out.println("Battle starts between " + hero1.getName() + " and " + hero2.getName());

            // Loop until one hero's health is zero or below
            while (hero1.getHealth() > 0 && hero2.getHealth() > 0) {
                System.out.println("\n### Round " + round + " ###");
                // Hero 1's turn
                System.out.println(hero1.getName() + "'s turn:");
                hero1.useAbility(hero2);

                // Check if hero 2 is still alive
                if (hero2.getHealth() <= 0) {
                    System.out.println(hero2.getName() + "\nhas been defeated!");
                    System.out.println(hero1.getName() + " wins the battle!");
                    return; // End battle if hero 2 is defeated
                }

                // Hero 2's turn
                System.out.println(hero2.getName() + "'s turn:");
                hero2.useAbility(hero1);

                // Check if hero 1 is still alive
                if (hero1.getHealth() <= 0) {
                    System.out.println(hero1.getName() + " has been defeated!");
                    System.out.println(hero2.getName() + " wins the battle!");
                    return; // End battle if hero 1 is defeated
                }

                round++;
            }

            // Final health status after the loop ends
            System.out.println("Final Status:");
            System.out.println(hero1.getName() + " health: " + hero1.getHealth());
            System.out.println(hero2.getName() + " health: " + hero2.getHealth());
        }

}

