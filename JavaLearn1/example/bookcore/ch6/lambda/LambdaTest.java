package bookcore.ch6.lambda;

import javax.swing.*;
import javax.swing.Timer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class LambdaTest {
    public static void main(String[] args) {
        String[] plants = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(plants));
        System.out.println(plants);
        System.out.println("Sorted in dictionary order : ");
        Arrays.sort(plants);
        System.out.println(plants);
        System.out.println(Arrays.toString(plants));
//        System.out.println("ABCDEFG HIJKLMN OPQ RST UVW XYZ");

        System.out.println("Sorted by length : ");
        Arrays.sort(plants, (first, second) ->
                first.length() - second.length()
        );
        //方法引用
        Arrays.sort(plants, Comparator.comparingInt(String::length)
        );
        System.out.println(Arrays.toString(plants));

        Timer timer = new Timer(1000, event ->
                System.out.println("The timer is " + new Date())
        );
        timer.start();

        //keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}
