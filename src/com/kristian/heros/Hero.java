package com.kristian.heros;
import com.kristian.weapons.Weapon;

public abstract class Hero{


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    int health;
    int strength;
    int dexterity;
    int intelligence;
    double level;

    public Hero(int health, int strength, int dexterity, int intelligence) {
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = 1;
    }

    public void heroSays(String str){
        System.out.print("Grrr im a " +str+ " hero");
    }

    public void equipWepon(){
//
    }

}
