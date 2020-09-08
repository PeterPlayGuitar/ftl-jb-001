package com.company.task024;

public class Task024 {
    public static void run() {
        MyStringBuilder sb = new MyStringBuilder();
        MyTextBox textBox = new MyTextBox("text_box");
        MyTextCollector textCollector = new MyTextCollector();

        sb.append("Hello");

        sb.addObserver(textBox);
        sb.addObserver(textCollector);

        sb.append(" World!");
        sb.append("NICE");

        System.out.println(sb.removeObserver(new MyTextCollector()));
        System.out.println(sb.removeObserver(textBox));

        sb.append("   WOOOOW   ");
    }
}
