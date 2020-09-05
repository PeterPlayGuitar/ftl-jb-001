package com.company.task020;

public class Pyramid implements IShape {
    protected double s;
    protected double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (s * h) / 3;
    }
}
