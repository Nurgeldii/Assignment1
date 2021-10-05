package com.company;

public class Troll extends Character{
    public Troll() {
        super(new AxeBehavior());
    }

    @Override
    void display() {
        System.out.println("I'm a Troll");
    }
}
