package com.company.task024;

public interface StringBuilderObservable {
    void addObserver(StringBuilderObserver observer);
    boolean removeObserver(StringBuilderObserver observer);
    void notifyObservers();
}
