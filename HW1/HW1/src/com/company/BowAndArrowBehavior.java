package com.company;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("My arrow is the fastest in the wild west");
    }
}
