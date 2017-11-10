package fuxitest.test3.hh;

import java.util.*;

public class main {

    public static void main(String[] args) {

            SortedSet<Entier> e = new TreeSet<>(new Croissant());

            e.add(new Entier(8));

            for (int i = 1; i < 20; i++) {
                e.add(new Entier(i));
            }


            System.out.println(" e = " + e);
            System.out.println(" e.headSet(3) = " + e.headSet(new Entier(3)));
            System.out.println(" e.headSet(8) = " + e.headSet(new Entier(8)));
            System.out.println(" e.subSet(3,8) = " + e.subSet(new Entier(3), new Entier(8)));
            System.out.println(" e.tailSet(5) = " + e.tailSet(new Entier(5)));

            SortedSet<Entier> e1 = new TreeSet<>(new Decroissant());
            e1.addAll(e);

            System.out.println(" e1 = " + e1);

    }
}
