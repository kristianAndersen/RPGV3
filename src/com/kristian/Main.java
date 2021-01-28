package com.kristian;
import com.kristian.heros.HeroFactory;
import  com.kristian.heros.Hero;
import com.kristian.weapons.Weapon;
import com.kristian.weapons.WeaponFactory;

public class Main {

    public static void main(String[] args) {
        HeroFactory HeroType = new HeroFactory();
        WeaponFactory  WeponType = new WeaponFactory();

        Hero warrior =HeroType.getHero("warrior");
       // warrior.heroSays("warrior");

        warrior.equipWeapon(WeponType.getWeapon("MELEE"));
        Weapon weapon=warrior.getWeapon();
        System.out.println(weapon);

        Hero ranger =HeroType.getHero("ranger");
        //ranger.heroSays("ranger");

    }
}
