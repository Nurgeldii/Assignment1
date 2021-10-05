package com.company;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("There is always a knife that you don't expect, and it is the sharpest of all.");
    }
}
