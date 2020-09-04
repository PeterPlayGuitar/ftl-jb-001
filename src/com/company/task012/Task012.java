package com.company.task012;

public class Task012 {
    public static void run() {

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int x = i - 1; x > 1; x--) {
                if (i % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }

    }
}
