package com.company.task015;

import java.security.InvalidParameterException;

public class ProbabilityCalculator<T> {
    private T[] values;
    private double[] weights;
    private double weightsSum = 0;

    public ProbabilityCalculator(T[] values, double[] weights) {
        if (values.length != weights.length)
            throw new InvalidParameterException("input arrays had different length");
        if (values.length == 0 || weights.length == 0)
            throw new InvalidParameterException("one of input arrays had no elements");

        this.values = values;
        this.weights = weights;

        for (double d : weights)
            weightsSum += d;
    }

    public T getRandomObject() {
        if (values.length == 1)
            return values[0];

        double randomNumber = Math.random() * weightsSum;

        double[] rangePoints = new double[weights.length + 1];
        rangePoints[0] = 0;
        double tmpSum = 0;
        for (int i = 0; i < weights.length; i++) {
            tmpSum += weights[i];
            rangePoints[i + 1] = tmpSum;
        }

        for (int i = 1; i < rangePoints.length; i++) {
            if (isMatchRange(randomNumber, rangePoints[i - 1], rangePoints[i])) {
                return values[i - 1];
            }
        }

        //unreachable
        return null;
    }

    /**
     * попадает ли число в диапозон
     */
    private boolean isMatchRange(double number, double rangeStart, double rangeEnd) {
        return number >= rangeStart && number < rangeEnd;
    }
}
