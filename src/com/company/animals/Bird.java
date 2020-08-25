package com.company.animals;

import java.text.BreakIterator;

public class Bird extends Animal {
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    public final void takeOff() {
        flyModeActive = true;
    }

    public final void landing() {
        flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(flyModeActive ? "Bird is flying" : "Duck is not flying");
    }

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }
}
