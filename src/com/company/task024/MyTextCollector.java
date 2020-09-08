package com.company.task024;

import java.util.Observable;
import java.util.Observer;

public class MyTextCollector implements StringBuilderObserver {

    private StringBuilder sb = new StringBuilder("");

    public MyTextCollector() {

    }

    @Override
    public void onNotified(String string) {
        sb.append(string);
        System.out.println(sb.toString());
    }
}
