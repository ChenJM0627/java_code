package practice;

import java.io.*;

public class test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\001.jpg");
        FileOutputStream fos = new FileOutputStream("F:\\001.png");

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read()) != -1){
            fos.write(len);

        }

        fos.close();
        fis.close();

    }
}
