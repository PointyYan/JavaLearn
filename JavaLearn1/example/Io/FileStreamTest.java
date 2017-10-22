package example.Io;

import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\Java\\a.txt");
        FileOutputStream fop = new FileOutputStream(f);

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        //写到缓存区
        writer.append("中文输入");

        //
        writer.append("\r\n");

        //刷新缓存区，写到文件中，如果下面已经没有写入的内容了，直接close也会写入
        writer.append("English");

        //关闭写入流，同时会把缓冲区内容写入文件，所以上面的的注释掉
        writer.close();

        fop.close();

        FileInputStream fip = new FileInputStream(f);

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

        StringBuffer sb = new StringBuffer();

        while (reader.ready()) {
            //转成char加到StringBuffer对象中
            sb.append((char) reader.read());

        }
        System.out.println(sb.toString());
        reader.close();

        fip.close();
    }
}
