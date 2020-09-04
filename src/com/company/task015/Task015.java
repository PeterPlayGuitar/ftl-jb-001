package com.company.task015;

public class Task015 {
    public static void run() {
        ProbabilityCalculator<String> probabilityCalculator = new ProbabilityCalculator<>(
                new String[]{"Hello", "Oh no", "Wow"},
                new double[]{0.1, 2, 10}
        );

        int counter0 = 0, counter1 = 0, counter2 = 0;
        for (int i = 0; i < 1000; i++) {
            switch (probabilityCalculator.getRandomObject()) {
                case "Hello":
                    counter0++;
                    break;
                case "Oh no":
                    counter1++;
                    break;
                case "Wow":
                    counter2++;
                    break;
            }
        }

        System.out.println("Сколько раз попался 0 элемент: " + counter0);
        System.out.println("Сколько раз попался 1 элемент: " + counter1);
        System.out.println("Сколько раз попался 2 элемент: " + counter2);
    }
}
