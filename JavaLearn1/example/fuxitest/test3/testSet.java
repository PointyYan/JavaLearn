package fuxitest.test3;

import java.util.*;
public class testSet {
    public static void main(String args[]) {
        Set<String> set = new HashSet<String>();
        set.add("Bernardine");
        set.add("Mandarine");
        set.add("Modestine");
        set.add("Justine");
        set.add("Mandarine");
        System.out.println(set);

        Set<String> sortedSet = new TreeSet<String>(set);
        System.out.println(sortedSet);
    }
}