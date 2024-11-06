package io.codeforall.fanstatics;
import io.codeforall.fanstatics.Heroes.Hero;
import java.util.List;


public class TurnManager {
    private List<Hero> heroes;
    private int round;

    public TurnManager(List<Hero> heroes) {
        this.heroes = heroes;
        this.round = 1; // Start with round 1
    }

    public void startBattle() {
        System.out.println("The battle begins with:");
        displayHeroes();


        while (heroesAlive() > 1 && round <= 20) {
            System.out.println("\n### Round " + round + " ###");

            for (int i = 0; i < heroes.size(); i++) {
                Hero attacker = heroes.get(i);

                if (attacker.getHealth() <= 0) continue;

                Hero target = heroes.get((i + 1) % heroes.size());

                if (target.getHealth() <= 0) continue;


                System.out.println(attacker.getName() + " attacks " + target.getName() + ":");
                attacker.useAbility(target);


                System.out.println(target.getName() + " health after attack: " + target.getHealth());


                if (target.getHealth() <= 0) {
                    System.out.println(target.getName() + " has been defeated!");
                }

                if (heroesAlive() == 1) {
                    break;
                }
            }

            displayHeroes();
            round++;
        }

        determineWinner();
    }

    private int heroesAlive() {
        int count = 0;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) count++;
        }
        return count;
    }

    private void displayHeroes() {
        System.out.println("------------ hero statuses -----------------");
        for (Hero hero : heroes) {
            System.out.println(hero.getName() + " health: " + hero.getHealth());
        }
    }

    private void determineWinner() {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                System.out.println("\nThe battle is over! " + hero.getName() + " wins with " + hero.getHealth() + " health left.");
                return;
            }
        }
        System.out.println("The battle ends in a draw. No heroes remain alive.");
    }
}
