package com.company;

public abstract class Character {
    private WeaponBehavior weaponBehavior;

    abstract void display();
    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }


    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight(){
        this.weaponBehavior.useWeapon();
    }
}
