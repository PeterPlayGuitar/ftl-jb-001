package com.company.task020;

public class Box implements IShape{

    protected double maxVolume;
    protected double volume;

    public Box(double maxVolume) {

        this.maxVolume = maxVolume;
        volume = 0;
    }

    public boolean add(IShape shape) {
        double expectedVolume = shape.getVolume() + volume;

        if (expectedVolume > maxVolume) {
            return false;
        }
        else {
            volume = expectedVolume;
            return true;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public int compareTo(IShape shape) {
        return Double.compare(volume, shape.getVolume());
    }
}
