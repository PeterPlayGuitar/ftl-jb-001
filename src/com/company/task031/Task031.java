package com.company.task031;

public class Task031 {
    public static void run() {
        ThreadFunction threadFunction1 = new ThreadFunction();

        Thread thread1 = new Thread(threadFunction1);
        Thread thread2 = new Thread(threadFunction1);

        thread1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
