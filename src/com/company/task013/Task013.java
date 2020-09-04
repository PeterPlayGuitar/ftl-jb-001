package com.company.task013;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task013 {
    public static void run() {
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = (int) (Math.random() * 4);
        int matchNumber = 3;

        System.out.println("Исходный массив:");
        for (int n : numbers)
            System.out.print(n + " ");
        System.out.println();


        //removing
        int counter = 0;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == matchNumber) counter++;

        int[] resultNumbers = new int[numbers.length - counter];
        for (int i = 0, j = 0; i < numbers.length; i++)
            if (numbers[i] != matchNumber) {
                resultNumbers[j++] = numbers[i];
            }
        numbers = resultNumbers;


        System.out.println("Результат массив:");
        for (int n : numbers)
            System.out.print(n + " ");
        System.out.println();
    }
}
