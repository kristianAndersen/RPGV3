package com.kristian.weapons;

import com.kristian.weapons.weaponTypes.WeaponMelee;

public class ThunderBlade extends WeaponMelee implements WeaponStats{


    String name;
    int level;


    public ThunderBlade(String name,int level){

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
