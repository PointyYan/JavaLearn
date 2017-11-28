package fuxitest.test3.demo;

import java.io.IOException;

public class TestIntSet{
    public static void main(String[] args) throws IOException {
        IntSetI s1 = new IntSet();
        IntSetI s2 = new IntSet();

        s1.insert(4);
        s1.insert(3);
        s1.insert(2);
        s1.insert(2);

        s2.insert(2);
        s2.insert(4);
        s2.insert(3);
        assert(s2.size() == 3);
        s2.insert(9);
        s2.insert(11);
        s2.insert(2002);

        System.out.println("s1 : " + s1 + " \ns2 : " + s2);
        assert s1.repOk() && s2.repOk();

        System.out.println("s1.subset(s1) : " + s1.subset(s1));
        assert(s1.subset(s1));
        System.out.println("s1.subset(s2) : " + s1.subset(s2));
    }}