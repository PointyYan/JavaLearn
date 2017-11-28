package fuxitest.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
    public static void main (String args[]) {
        String s;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.println("Type Q to exit.");
        try {
            s = in.readLine();
            while (s != null && !s.matches("Q")) {
                System.out.println("Read: " + s);
                s = in.readLine();
            }
            in.close(); // Close the buffered reader.
        } catch (IOException e) { // Catch any IO exceptions.
            e.printStackTrace();
        }
    }
}
