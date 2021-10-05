package com.company;

public class Main {

    public static void main(String[] args) {

        Character character = new Troll();

        character.display();
        character.fight();

        character.setWeaponBehavior(new BowAndArrowBehavior());
        System.out.println();
        character.fight();

    }
}
