package com.company.task024;

public class MyTextBox implements StringBuilderObserver {

    private String string = "";

    public MyTextBox(String string) {
        this.string = string;
    }

    @Override
    public void onNotified(String string) {
        System.out.println("TextBox: " + string);
    }
}
