package com.company.task008;

public class Task008 {
    public static void run() {
        int n0 = 1, n1 = 1, next;

        System.out.print(n0 + " " + n1 + " ");
        for (int i = 0; i < 9; i++) {
            next = n0 + n1;
            System.out.print(next + " ");
            n0 = n1;
            n1 = next;
        }
    }
}
