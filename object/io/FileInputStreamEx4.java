package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 복사 프로그램
// FileInputStream
public class FileInputStreamEx4 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("c:\\temp\\images2.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output2.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            int data = 0;

            byte b[] = new byte[4096];
            while ((data = bis.read(b)) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
