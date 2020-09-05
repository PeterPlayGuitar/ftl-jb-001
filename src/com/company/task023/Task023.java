package com.company.task023;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task023 {
    public static void run() {

        MyStringBuilder sb = new MyStringBuilder(3);
        sb.append("hello ");
        sb.append("world").append("!");

        System.out.println(sb.toString());
        sb.undo();
        System.out.println(sb.toString());
        sb.undo();
        System.out.println(sb.toString());
        sb.undo();
        sb.undo();
        sb.undo();
        sb.undo();
        sb.undo();
        System.out.println(sb.toString());
        sb.append("Oh no!");
        sb.append("Wow");
        sb.undo();
        sb.append("Hey!");
        System.out.println(sb.toString());


        MyStringBuilder sb2 = new MyStringBuilder("Hello", 2);
        sb2.append("1");
        sb2.append("2");
        sb2.append("3");
        sb2.append("4");
        sb2.append("5");
        sb2.undo();
        sb2.undo();
        sb2.undo();
        sb2.undo();
        sb2.undo();
        sb2.undo();
        sb2.undo();
        sb2.undo();
        sb2.undo();
        sb2.undo();
        System.out.println(sb2.toString());

    }
}
