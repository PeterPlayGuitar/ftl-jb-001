package com.company.task018;

public class Pyramid extends Shape {
    protected double s;
    protected double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;

        volume = (s * h) / 3;
    }
}
