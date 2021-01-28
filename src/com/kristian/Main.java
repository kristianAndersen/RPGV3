package com.kristian;
import com.kristian.heros.HeroFactory;
import  com.kristian.heros.Hero;
import com.kristian.weapons.BarbaricHarp;
import com.kristian.weapons.DavidBowi;
import com.kristian.weapons.ThunderBlade;
import com.kristian.weapons.Weapon;


public class Main {

    public static void main(String[] args) {
        HeroFactory HeroType = new HeroFactory();

        ThunderBlade TB=new ThunderBlade("Thunder Blade",5);
        System.out.println(TB.getWeaponName());
        System.out.println(TB.getWeaponDamage());
        System.out.println(TB.getTotalWeaponDamage());

        System.out.println("\n");

        DavidBowi DB =new DavidBowi("Dawid Bowi",2);
        System.out.println(DB.getWeaponName());
        System.out.println(DB.getWeaponDamage());
        System.out.println(DB.getTotalWeaponDamage());

        System.out.println("\n");

        BarbaricHarp BH =new BarbaricHarp("Barbaric Harp",1);
        System.out.println(BH.getWeaponName());
        System.out.println(BH.getWeaponDamage());
        System.out.println(BH.getTotalWeaponDamage());




        Hero warrior = HeroType.getHero("warrior");
       // warrior.heroSays("warrior");
        warrior.equipWeapon(new ThunderBlade("ThunderBlade",0));

        Weapon weapon = warrior.getWeapon();


        Hero ranger =HeroType.getHero("ranger");
        //ranger.heroSays("ranger");

    }
}
