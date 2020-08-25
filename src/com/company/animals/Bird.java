package com.company.animals;

import java.text.BreakIterator;

public abstract class Bird extends Animal implements Flight {
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    @Override
    public void takeOff() {
        flyModeActive = true;
    }

    @Override
    public void landing() {
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
