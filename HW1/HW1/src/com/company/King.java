package com.company;

public class King extends Character{
    public King() {
        super(new KnifeBehavior());
    }

    @Override
    void display() {
        System.out.println("I am a King!");
    }
}
