package com.company.task020;

public class Ball implements ISolidOfRevolution {

    protected double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * radius * radius * radius) / 3.;
    }
}
