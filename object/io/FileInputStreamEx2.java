package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 복사 프로그램
// FileInputStream
public class FileInputStreamEx2 {
    public static void main(String[] args) {
        // 입력스트림 : file 에서 읽어오기
        FileInputStream fis = null;
        // 출력스트림 : file 에 쓰기
        FileOutputStream fos = null;
        try {
            // FileInputStream fis = new FileInputStream(new File("c:\\temp\\file.txt"));
            fis = new FileInputStream("c:\\temp\\images2.jpg");
            fos = new FileOutputStream("c:\\temp\\output1.jpg");

            int data = 0;

            // 1024byte로 일고 1024 바이트로 쓰고,
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
