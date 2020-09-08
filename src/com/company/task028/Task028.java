package com.company.task028;

public class Task028 {
    public static void run() {
        TwoDimensionalArray<Integer> array = new TwoDimensionalArray<>(new Integer[][]{{2, 3, 0}, {5, 6, 7, 0}, {8, 9, 10, 0}});
        for (Integer i : array) {
            System.out.print(i + " ");
        }
    }
}
