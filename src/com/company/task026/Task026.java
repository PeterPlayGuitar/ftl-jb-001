package com.company.task026;

import java.util.*;

public class Task026 {
    private static <E> Collection cleanCollection(Collection<E> collection) {
        return new HashSet<>(collection);
    }

    public static void run() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 6, 5, 65, 3));
        Collection collection = cleanCollection(list);
        System.out.println(collection);
    }
}
