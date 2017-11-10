package fuxitest.test3.maptest;

import java.util.*;

public class MapTest {
    public static void main(String args[]) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        Integer ONE = 1;
        for (String key : args) {
            Integer frequency = (Integer) map.get(key);
            if (frequency == null) {
                frequency = ONE;
            } else {
                int value = frequency;
                frequency = value + 1;
            }
            map.put(key, frequency);
        }
        System.out.println(map);
        Map<String,Integer> sortedMap = new TreeMap<String,Integer> (map);
        System.out.println(sortedMap);
    }
}
