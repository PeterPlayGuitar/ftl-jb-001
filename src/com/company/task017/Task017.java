package com.company.task017;

public class Task017 {

    private static double equation(double x) {
        return Math.cos(x * x * x * x * x) + x * x * x * x - 345.3 * x - 23;
    }

    private static double solveEquationOnRange(double rangeStart, double rangeEnd, double epsilon) {
        double rangeMiddle = (rangeStart + rangeEnd) / 2;

        if (epsilon > Math.abs(equation(rangeMiddle)))
            return rangeMiddle;

        if (equation(rangeStart) * equation(rangeMiddle) < 0) {
            return solveEquationOnRange(rangeStart, rangeMiddle, epsilon);
        } else {
            return solveEquationOnRange(rangeMiddle, rangeEnd, epsilon);
        }
    }

    public static void run() {

        double rangeStart = -1;
        double rangeEnd = 5;
        double epsilon = 0.001;

        System.out.println(solveEquationOnRange(rangeStart, rangeEnd, epsilon));
    }
}
