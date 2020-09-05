package com.company.task018;

public class Box extends Shape {

    protected double maxVolume;

    public Box(double maxVolume) {

        this.maxVolume = maxVolume;
        volume = 0;
    }

    public boolean add(Shape shape) {
        double expectedVolume = shape.getVolume() + volume;

        if (expectedVolume > maxVolume) {
            return false;
        }
        else {
            volume = expectedVolume;
            return true;
        }
    }
}
