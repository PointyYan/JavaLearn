package example.Io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayIO {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        while (byteArrayOutputStream.size() != 10) {
            //获取用户输入值
            System.out.println("Write something");
            byteArrayOutputStream.write(System.in.read());

        }

        byte[] b = byteArrayOutputStream.toByteArray();
        System.out.println("Print the content");
        for (byte aB : b) {
            //打印字符
            System.out.println((char) aB + "  ");
        }
        System.out.println("  ");

        int c;

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);

        System.out.println("Converting character to Upper case ");

        for (int i = 0; i < 1; i++) {
            while ((c = byteArrayInputStream.read()) != -1) {
                System.out.println(Character.toUpperCase((char) c));

            }
            byteArrayInputStream.reset();
        }

    }
}
