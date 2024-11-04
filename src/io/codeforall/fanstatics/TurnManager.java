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
        System.out.println("Battle starts between " + hero1.getName() + " and " + hero2.getName());

        System.out.println(hero1.getName() + " 's turn");
        hero1.useAbility(hero2);

        if(hero2.getHealth() > 0){
            System.out.println(hero2.getName() + "'s turn");
            hero2.useAbility(hero1);
        }

     //   System.out.println(hero1.getName() + " health " + hero1.getHealth());
     //   System.out.println(hero2.getName() + " health " + hero2.getHealth());
    }
}
