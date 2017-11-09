package fuxitest.test1;

public class student implements Comparable<student> {
    public int id;
    public String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override

    public int compareTo(student o) {
        return Integer.compare(id, o.id);
    }
}
