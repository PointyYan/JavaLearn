package fuxitest.ch10;

import java.io.IOException;

public class ReadHello {
    public static void main(String args[ ]) {
        char inchar;
        System.out.println("Enter a character:");
        try{
            inchar=(char)System.in.read();
            System.out.println(" "+ inchar);
        }catch(IOException e){
            System.out.println("Error reading from user");
        }
    }
}
