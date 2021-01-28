package com.kristian;
import com.kristian.heros.HeroFactory;
import  com.kristian.heros.Hero;
public class Main {

    public static void main(String[] args) {
        HeroFactory HeroType = new HeroFactory();

        Hero warrior =HeroType.getHero("warrior");
        warrior.heroSays("warrior");

        Hero ranger =HeroType.getHero("ranger");
        ranger.heroSays("ranger");

    }
}
