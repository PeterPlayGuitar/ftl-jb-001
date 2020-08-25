package com.company.L013;

import java.util.Random;

public class SwitchExample {

    public static void run() {
        Random rand = new Random();
        int example = rand.nextInt(5);

       //if (example == 0) {
       //    System.out.println("This is zero");
       //} else if (example == 1) {
       //    System.out.println("This is one");
       //} else if (example == 2) {
       //    System.out.println("This is two");
       //} else {
       //    System.out.println("Other digit");
       //}

        switch (example){
            case 0:
                System.out.println("This is zero");
                break;
            case 1:
                System.out.println("This is one");
                break;
            case 2:
                System.out.println("This is two");
                break;
            default:
                System.out.println("Other digit");
                break;
        }
    }
}
