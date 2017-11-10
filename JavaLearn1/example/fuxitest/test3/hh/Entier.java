package fuxitest.test3.hh;

public class Entier implements Comparable<Object> {

    private int i;
    Entier(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Entier)
            if (i < ((Entier)o).intValue()) return -1;
            else if (i == ((Entier)o).intValue()) return 0;
            else return 1;
        else throw new ClassCastException();
    }

    public boolean equals(Object o){ return this.compareTo(o) == 0; }
    private int intValue(){ return i;}
    public String toString(){ return Integer.toString( i);}

}
