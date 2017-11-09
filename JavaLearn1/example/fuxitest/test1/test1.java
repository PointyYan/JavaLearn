package fuxitest.test1;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        student[] students = new student[]{};

        students[0] = new student(672029, "qqy");
        students[1] = new student(272032, "q2q");
        students[2] = new student(372019, "qq2");
        students[3] = new student(671019, "www");

        for (student student1 : students) {
            System.out.println(student1);
        }

        Arrays.sort(students);

        for (fuxitest.test1.student student : students) {
            System.out.println(student);
        }


    }

}


