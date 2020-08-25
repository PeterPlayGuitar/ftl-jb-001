package com.company.animals;

import java.text.BreakIterator;

public class Bird extends Animal {
    protected Boolean flyModeActive = false;

    public Bird() {
        canFly = true;
    }

    public void takeOff() {
        flyModeActive = true;
    }

    public void landing() {
        flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(flyModeActive ? "Duck is flying" : "Duck is not flying");
    }
}
