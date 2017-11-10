package fuxitest.test3.maptest;

import java.util.*;

public class MapTest2 {
    private static Collection<String> fill(Collection<String> c) {
        c.add("dog");
        c.add("dog");
        c.add("cat");
        return c;
    }
    private static Map<String, String> fill(Map<String, String> m) {
        m.put("dog", "Bosco");
        m.put("dog", "Spot");
        m.put("cat", "Rags");
        return m;
    }
    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new HashMap<>()));
    }

}
