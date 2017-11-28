package fuxitest.test3.demo;

import java.util.Iterator;

public interface IntSetI {

    public void insert(int x);
    public void remove(int x);
    public boolean isIn(int x);
    public int choose() ;
    public int size();
    public Iterator iterator();
    public boolean subset(IntSetI s);
    public boolean repOk();
}
