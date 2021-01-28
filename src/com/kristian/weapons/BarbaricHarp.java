package com.kristian.weapons;

import com.kristian.weapons.weaponTypes.WeaponMagic;

public class BarbaricHarp  extends WeaponMagic implements WeaponStats{


    String name;
    int level;


    public BarbaricHarp(String name,int level){

        this.name=name;
        this.level=level;

    }


    @Override
    public String getWeaponName() {

        return this.name;
    }

    @Override
    public String getWeaponType() {

        return this.weaponType;
    }

    @Override
    public int getWeaponLevel() {

        return this.level;
    }

    @Override
    public int getWeaponDamage() {

        return super.damage;
    }

    @Override
    public int getTotalWeaponDamage() {

        return super.damage+(this.level*super.scale);
    }
}
