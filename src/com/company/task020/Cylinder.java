package com.company.task020;

public class Cylinder implements ISolidOfRevolution {

    protected double height;
    protected double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return height * Math.PI * radius * radius;
    }
}
