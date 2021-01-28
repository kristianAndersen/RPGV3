package com.kristian.weapons;

import com.kristian.weapons.Weapon;
import com.kristian.weapons.weaponTypes.WeaponMelee;

public class WeaponFactory {

     public Weapon getWeapon(String weaponType){

         if(weaponType == null){
             return null;
         }

         if (weaponType.equalsIgnoreCase("MELEE")) {

             return new WeaponMelee();
         }

         return null;
     }


}
