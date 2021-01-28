package com.kristian.heros;


import com.kristian.heros.herotypes.HeroRanger;
import com.kristian.heros.herotypes.HeroWarrior;

public class HeroFactory {

    public Hero getHero(String heroType){

        if(heroType == null){
            return null;
        }

        if (heroType.equalsIgnoreCase("WARRIOR")) {

            return new HeroWarrior();
        }

        if (heroType.equalsIgnoreCase("RANGER")) {
            return new HeroRanger();
        }

        if (heroType.equalsIgnoreCase("MAGE")) {
        }

        return null;

    }
}
