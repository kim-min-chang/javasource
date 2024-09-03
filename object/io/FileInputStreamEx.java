package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// FileInputStream
public class FileInputStreamEx {
    public static void main(String[] args) {
        // 입력스르림 : file 에서 읽어오기
        FileInputStream fis = null;
        try {
            // FileInputStream fis = new FileInputStream(new File("c:\\temp\\file.txt"));
            fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
            int data = 0;
            try {
                while ((data = fis.read()) != -1) {
                    System.out.print((char) data);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
