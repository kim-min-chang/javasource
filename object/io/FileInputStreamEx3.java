package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일 복사 프로그램
// FileInputStream
public class FileInputStreamEx3 {
    public static void main(String[] args) {
        // 입력스트림 : file 에서 읽어오기
        // FileInputStream fis = null;
        // // 출력스트림 : file 에 쓰기
        // FileOutputStream fos = null;

        // try - with - resources
        // try(닫아야 하는 자원 생성) : finally 안에 닫기 명시 하지 않아도 자동으로 닫음
        try {
            FileInputStream fis = new FileInputStream("c:\\temp\\images2.jpg");
            FileOutputStream fos = new FileOutputStream("c:\\temp\\output1.jpg");
            int data = 0;

            // 1024byte로 일고 1024 바이트로 쓰고,
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
