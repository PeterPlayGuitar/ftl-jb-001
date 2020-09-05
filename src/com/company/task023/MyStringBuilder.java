package com.company.task023;

import java.util.*;

public class MyStringBuilder {
    private StringBuilder stringBuilder;
    private final int depthOfUndoOperations;
    private Deque<Integer> operations;

    public MyStringBuilder(String string, int depthOfUndoOperations) {
        stringBuilder = new StringBuilder(string);
        this.depthOfUndoOperations = depthOfUndoOperations;
        operations = new ArrayDeque<>();
    }

    public MyStringBuilder(int depthOfUndoOperations) {
        this("", depthOfUndoOperations);
    }

    public MyStringBuilder append(String string) {

        stringBuilder.append(string);

        operations.addLast(string.length());
        if (operations.size() > depthOfUndoOperations)
            operations.pop();

        return this;
    }

    public boolean undo() {
        if (operations.isEmpty())
            return false;

        int numberOfSymbols = operations.getLast();
        stringBuilder.replace(stringBuilder.length() - numberOfSymbols, stringBuilder.length(), "");

        operations.removeLast();

        return true;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
