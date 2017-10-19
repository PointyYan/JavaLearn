package Task9.File;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

public class FileTest {

    public void copyFolder(String oldPath, String newPath) {
        try {
            //如果文件夹不存，则创建新的文件夹
            (new File(newPath)).mkdirs();
            //读取整个文件夹的内容到file字符串数组，下面设置一个游标i，不停的向下移开始读取这个数组
            File fileList = new File(oldPath);
            String[] file = fileList.list();
            //
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                //
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }

                //
                if (temp.isFile()) {
                    FileInputStream inputStream = new FileInputStream(temp);
                    FileOutputStream outputStream = new FileOutputStream(newPath + "/" + "rename_" + (temp.getName()).toString());
                    byte[] bufferArray = new byte[1024 * 64];
                    int preReadLength;
                    while ((preReadLength = inputStream.read(bufferArray)) != -1) {
                        outputStream.write(bufferArray, 0, preReadLength);
                    }
                    outputStream.flush();
                    outputStream.close();
                    inputStream.close();
                }

                //
                if (temp.isDirectory()) {
                    copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
