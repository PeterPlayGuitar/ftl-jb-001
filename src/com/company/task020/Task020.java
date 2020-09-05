package com.company.task020;

public class Task020 {
    public static void run() {
        double boxMaxVolume = 40;

        Pyramid pyramid = new Pyramid(3, 1);
        Cylinder cylinder = new Cylinder(15, 1);
        Ball ball = new Ball(2);
 
        Box box = new Box(boxMaxVolume);


        System.out.println("pyramid's volume: " + pyramid.getVolume());
        System.out.println("cylinder's volume: " + cylinder.getVolume());
        System.out.println("ball's volume: " + ball.getVolume());

        System.out.println("box's max volume: " + boxMaxVolume);

        System.out.println();

        System.out.println("box's current volume: " + box.getVolume());
        System.out.println("adding pyramid: " + box.add(pyramid));
        System.out.println("box's current volume: " + box.getVolume());
        System.out.println("adding ball: " + box.add(ball));
        System.out.println("box's current volume: " + box.getVolume());
        System.out.println("adding cylinder: " + box.add(cylinder));
        System.out.println("box's current volume: " + box.getVolume());

        System.out.println("\nComparing time!\n");

        System.out.println("Pyramid volume: " + pyramid.getVolume() + "; cylinder volume: " + cylinder.getVolume() + "; pyramid.compareTo(cylinder): " + pyramid.compareTo(cylinder));
        System.out.println("Cylinder volume: " + cylinder.getVolume() + "; pyramid volume: " + pyramid.getVolume() + "; cylinder.compareTo(pyramid): " + cylinder.compareTo(pyramid));
        System.out.println("Box volume: " + box.getVolume() + "; ball volume: " + ball.getVolume() + "; box.compareTo(ball): " + box.compareTo(ball));
    }
}
