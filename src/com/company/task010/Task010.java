package com.company.task010;

public class Task010 {
    public static void run() {
        double[] numbers = new double[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
            System.out.println(numbers[i]);
        }

        double maxNumber = Double.NEGATIVE_INFINITY;
        for (double v : numbers)
            if (v > maxNumber) {
                maxNumber = v;
            }
        System.out.println("max: " + maxNumber);

        double minNumber = Double.POSITIVE_INFINITY;
        for (double number : numbers)
            if (number < minNumber) {
                minNumber = number;
            }
        System.out.println("min: " + minNumber);

        double sum = 0;
        for (double number : numbers)
            sum += number;
        System.out.println("average: " + sum / numbers.length);

    }
}
