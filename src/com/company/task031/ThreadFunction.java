package com.company.task031;

public class ThreadFunction implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
