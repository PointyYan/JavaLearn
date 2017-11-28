package fuxitest.ch10;

import java.io.IOException;

public class TestIo {
    public static void main(String args[]) {
        try {
            byte bArray[] = new byte[128];
            System.out.println("Enter something:");
            System.in.read(bArray);
            System.out.print("You entered:");
            for (int i = 0; i < 128; i++)
                System.out.print(bArray[i]);
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
