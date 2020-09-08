package com.company.task024;

import java.util.ArrayList;
import java.util.List;

public class MyStringBuilder implements StringBuilderObservable {
    private StringBuilder stringBuilder;
    private List<StringBuilderObserver> observers = new ArrayList<>();

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public void append(String str) {
        stringBuilder.append(str);
        notifyObservers();
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    @Override
    public void addObserver(StringBuilderObserver observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(StringBuilderObserver observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StringBuilderObserver o : observers)
            o.onNotified(toString());
    }
}
