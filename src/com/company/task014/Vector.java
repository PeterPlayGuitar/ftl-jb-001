package com.company.task014;

import java.util.Random;

public final class Vector {
    private final double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Скалярное произведение
     */
    public static double dotProduct(final Vector v1, final Vector v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    /**
     * Векторное произведение
     */
    public static Vector crossProduct(Vector v1, Vector v2) {
        return new Vector(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
    }

    public static double cosOfAngle(Vector v1, Vector v2) {
        double v1Mag = v1.magnitude();
        double v2Mag = v2.magnitude();

        if (v1Mag == 0 || v2Mag == 0) throw new ArithmeticException("input vector magnitude was zero");

        return dotProduct(v1, v2) / (v1Mag * v2Mag);
    }

    public static Vector sum(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector diff(Vector v1, Vector v2) {
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public static Vector[] randomVectors(final int N, long seed) {
        Random rand = new Random(seed);

        Vector[] vectors = new Vector[N];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(rand.nextDouble() * 200 - 100, rand.nextDouble() * 200 - 100, rand.nextDouble() * 200 - 100);
        }

        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
