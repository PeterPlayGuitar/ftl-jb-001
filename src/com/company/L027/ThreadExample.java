package com.company.L027;

public class ThreadExample {

    private static void runAnotherThread(String message) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    System.out.println(i + ": " + message);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void run() {
        runAnotherThread("thread 1");
        runAnotherThread("thread 2");
        runAnotherThread("thread 3");
        runAnotherThread("thread 4");
        runAnotherThread("thread 5");

    }
}
