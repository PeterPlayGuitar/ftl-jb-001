package com.company.task018;

public class Cylinder extends SolidOfRevolution {

    protected double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        super.radius = radius;

        volume = height * Math.PI * radius * radius;
    }

}
