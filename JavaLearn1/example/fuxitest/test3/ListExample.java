package fuxitest.test3;

import java.util.*;

public class ListExample {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("Bernardine");
        list.add("Modestine");
        list.add("Clementine");
        list.add("Justine");
        list.add("Clementine");
        System.out.println(list);
        System.out.println("2: " + list.get(2));
        System.out.println("0: " + list.get(0));


        LinkedList<String> queue = new LinkedList<>();
        queue.addFirst("Bernardine");
        queue.addFirst("Modestine");
        queue.addFirst("Justine");
        System.out.println(queue);
        queue.removeLast();
        queue.removeLast();
        System.out.println(queue);
    }
}
