package com.kristian.weapons;

import com.kristian.weapons.weaponTypes.WeaponMelee;

public class ThunderBlade extends WeaponMelee implements WeaponStats{

    String type;
    String name;
    int level;
    int damage;

    public ThunderBlade(String type, String name,int level, int damage){

        this.type=type;
        this.name=name;
        this.level=level;
        this.damage=damage;

    }




    @Override
    public String getWeaponName() {
        return null;
    }

    @Override
    public String getWeaponType() {
        return null;
    }

    @Override
    public int getWeaponLevel() {
        return 0;
    }

    @Override
    public int getWeaponDamage() {
        return 0;
    }

    @Override
    public int getTotalWeaponDamage() {
        return 0;
    }

}
