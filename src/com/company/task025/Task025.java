package com.company.task025;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task025 {

    private static <T> T[] filter(T[] array, Filter filter, Class<T> clazz) {
        List<T> newArray = new ArrayList<>();

        for (T o : array) {
            if (filter.apply(o)) {
                newArray.add(o);
            }
        }

        @SuppressWarnings("unckecked")
        T[] ts = (T[]) Array.newInstance(clazz, newArray.size());

        for (int i = 0; i < ts.length; i++)
            ts[i] = newArray.get(i);

        return ts;
    }

    public static void run() {
        String[] strings = {"Hello", "nice", "Wow", "ice"};
        String[] stringsModified = (String[]) filter(strings, new StringFilter(), String.class);

        for (String s : stringsModified)
            System.out.println(s);


        Integer[] integers = {3, 6, 4, 7, 4, 0, 7, 3, 3, 43, 54, 6, 45, 34, 24, 23, 423, 432, 4, 234, 34, 3};
        System.out.println(Arrays.toString(filter(integers, new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof Integer) {
                    Integer i = (Integer) o;
                    return i >= 10;
                }
                return false;
            }
        }, Integer.class)));
    }
}
