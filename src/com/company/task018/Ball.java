package com.company.task018;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super.radius = radius;
        volume = (4 * Math.PI * radius * radius * radius) / 3.;
    }

}
