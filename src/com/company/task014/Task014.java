package com.company.task014;

public class Task014 {
    public static void run() {
        Vector v1 = new Vector(1, 0, 0);
        Vector v2 = new Vector(2, -1, 3);

        System.out.println("v1: " + v1.toString());
        System.out.println("v2: " + v2.toString());
        System.out.println("Magnitude v1: " + v1.magnitude());
        System.out.println("Magnitude v2: " + v2.magnitude());
        System.out.println("Скаларное произведение: " + Vector.dotProduct(v1, v2));
        System.out.println("Векторное произведение: " + Vector.crossProduct(v1, v2));
        System.out.println("Cos: " + Vector.cosOfAngle(v1, v2));
        System.out.println("v1 + v2: " + Vector.sum(v1, v2));
        System.out.println("v1 - v2: " + Vector.diff(v1, v2));
        System.out.println();

        Vector[] vectors = Vector.randomVectors(4, 5);

        for(Vector vector: vectors)
            System.out.println(vector);
    }
}
