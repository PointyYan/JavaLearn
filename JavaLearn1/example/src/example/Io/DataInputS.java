package example.Io;

import java.io.*;

public class DataInputS {
    public static void main(String[] args) throws IOException {

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("E:\\Java\\test.txt"));
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("E:\\Java\\test1.txt"));

        String count;
        while ((count = dataInputStream.readLine()) != null) {
            String u = count.toUpperCase();
            System.out.println(u);
            dataOutputStream.writeBytes(u + " ,");
        }

        dataInputStream.close();
        dataOutputStream.close();

    }
}
