package com.company.task028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TwoDimensionalArray<E> implements Iterable<E> {

    E[][] data;

    public TwoDimensionalArray(E[][] data) {
        this.data = data;
    }

    @Override
    public Iterator<E> iterator() {

        System.out.println("a");

        List<E> commonElements = new ArrayList<>();
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                commonElements.add(data[i][j]);

        int index = 0;

        return commonElements.iterator();
    }
}
