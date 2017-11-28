package fuxitest.test3.demo;

import java.util.Iterator;
import java.util.Vector;
//import java.io.IOException;

public class IntSet implements IntSetI {

    private Vector<Integer> els;

    IntSet() {
        els = new Vector<>();
    }

    public boolean isIn(int x) {
        return els.indexOf(x) >= 0;
    }

    public void insert(int x) {
        if (!isIn(x)) {
            els.add(x);
        }
    }

    public void remove(int x) {
        els.remove(new Integer(x));
    }

    public int choose() {
        if (size() == 0) System.out.println( "0");;
        return els.lastElement();
    }

    public int size() {
        return els.size();
    }


    public boolean subset(IntSetI s) {
        if (s == null) return false;
        int i = 0;
        while (i < els.size()) {
            if (!s.isIn(els.get(i)))
                return false;
            i++;
        }
        return true;
    }

    public Iterator iterator() {
        return els.iterator();
    }

    public boolean equals(Object o) {
        if (o instanceof IntSet) {
            IntSet s = (IntSet) o;
            return this.subset(s) && s.subset(this);
        }
        return false;
    }

    public String toString() {
        return this.els.toString().replace('[','{').replace(']','}');
    }

    public boolean repOk() {
        if (els == null) return false;
        for (int i = 0; i < els.size(); i++) {
            Object x = els.get(i);
            if (x == null)
                return false;
            for (int j = i + 1; j < els.size(); j++)
                if (x.equals(els.get(j)))
                    return false;
        }
        return true;
    }
}
