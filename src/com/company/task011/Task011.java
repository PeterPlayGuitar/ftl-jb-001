package com.company.task011;

import java.util.Arrays;

public class Task011 {
    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 1; j < array.length; j++)
                if (array[j] < array[j - 1]) {
                    double tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
    }

    public static void run() {
        System.out.println("Origin array:");
        double[] array = {3.4, 3.7, 0, 2.4, 84, 3, 5.3, 7, -2};
        for (double d : array)
            System.out.print(d + " ");

        bubbleSort(array);

        System.out.println("\nSorted: ");
        for (double d : array)
            System.out.print(d + " ");
    }
}
