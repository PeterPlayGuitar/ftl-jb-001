package com.company.task009;

import java.util.Scanner;

public class Task009 {
    private static final int NUMBER_OF_ATTEMPTS = 3;

    public static void run() {
        System.out.println("Загадка: синий, большой, с усами и полностью набит зайцами?");

        int attempts = 0;
        String userAnswer = "";
        boolean answerWasCorrectFlag = false;
        Scanner scanner = new Scanner(System.in);

        while (attempts < NUMBER_OF_ATTEMPTS && !answerWasCorrectFlag) {
            System.out.print("Что это?: ");

            userAnswer = scanner.next();

            switch (userAnswer) {
                case "Троллейбус":
                    System.out.println("Правильно!");
                    answerWasCorrectFlag = true;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: Троллейбус");
                    attempts = 3;
                    break;
                default:
                    attempts += 1;
                    if (attempts < 3)
                        System.out.println("Неправильно: у тебя " + (NUMBER_OF_ATTEMPTS - attempts) + " попытки");
                    else
                        System.out.println("Гуляй)");
                    break;
            }
        }
    }
}
