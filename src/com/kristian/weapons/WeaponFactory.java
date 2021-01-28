package com.kristian.weapons;

import com.kristian.weapons.weaponTypes.WeaponMelee;

public class WeaponFactory {

     public WeaponMelee getWeapon(String weaponType){

         if(weaponType == null){
             return null;
         }

         if (weaponType.equalsIgnoreCase("MELEE")) {

             return new ThunderBlade();
         }

         return null;
     }


}
