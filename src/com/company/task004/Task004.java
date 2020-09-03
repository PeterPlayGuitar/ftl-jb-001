package com.company.task004;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task004 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int inputNumber;
        try {
            inputNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Can't parse that");
            return;
        }

        int sum = 0;
        for(int i = 0; i <= inputNumber; i++){
            sum += i;
        }

        System.out.println("Summa = " + sum);
    }
}
