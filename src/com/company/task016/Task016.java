package com.company.task016;

import java.time.Clock;
import java.util.Arrays;
import java.util.Random;

public class Task016 {

    private static boolean containsIteratively(int[] array, int matchNumber) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == matchNumber)
                return true;
        return false;
    }

    private static boolean containsBinarySearch(int[] array, int matchNumber) {
        int indexStart = 0;
        int indexEnd = array.length - 1;
        int middleIndex;

        do {
            middleIndex = (indexStart + indexEnd) / 2;
            if (array[middleIndex] > matchNumber) {
                indexEnd = middleIndex;
            } else if (array[middleIndex] < matchNumber) {
                indexStart = middleIndex;
            } else
                return true;
        } while (indexEnd - indexStart > 2);

        if (array[indexStart] == matchNumber || array[middleIndex] == matchNumber || array[indexEnd] == matchNumber)
            return true;

        return false;
    }

    public static void run() {
        int[] array = new int[100000000];
        Random rand = new Random(0);
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        boolean contains;
        long startTime;
        long endTime;

        System.out.println("Start!");

        startTime = System.currentTimeMillis();
        containsIteratively(array, 457467654);
        endTime = System.currentTimeMillis();
        System.out.println("Time passed: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        containsBinarySearch(array, 457467654);
        endTime = System.currentTimeMillis();
        System.out.println("Time passed: " + (endTime - startTime));
    }
}
