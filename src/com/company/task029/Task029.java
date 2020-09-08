package com.company.task029;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task029 {

    private static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();

        for (K k : ks) {
            if (map.containsKey(k)) {
                map.replace(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }

        return map;
    }

    public static void run() {
        Map<String, Integer> stringIntegerMap = arrayToMap(new String[]{"Hello", "Hi", "Hi", "Hey", "Hi", "shit", "Hey"});
        System.out.println(stringIntegerMap.toString());
    }
}
