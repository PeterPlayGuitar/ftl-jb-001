package com.company.task027;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task027 {

    private static void fillArray(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
    }

    private static void pickElements(List<Integer> list) {
        System.out.println("Start computing...");
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++)
            list.get((int) (Math.random() * 100_000));
        long timeEnd = System.currentTimeMillis();
        System.out.println("Computing finished");
        System.out.println("Spent time: " + (timeEnd - timeStart));

    }

    public static void run() {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        fillArray(array);
        fillArray(list);

        pickElements(array);
        pickElements(list);
    }
}
