package fuxitest.test3.hh;

import java.util.*;

public class Croissant implements Comparator<Object> {

    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable)
            return ((Comparable<Object>) o1).compareTo(o2);
        else throw new ClassCastException();
    }
}
class Decroissant implements Comparator<Object> {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable)
            return -((Comparable<Object>) o1).compareTo(o2);
        else throw new ClassCastException();
    }

}
