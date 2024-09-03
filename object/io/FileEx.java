package io;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File f = new File("c:\\temp\\text.txt");

        String fileName = f.getName(); // text.txt
        int pos = fileName.lastIndexOf(".");

        System.out.println("경로를 제외한 파일명 : " + f.getName());
        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos));
        System.out.println("확장자 : " + fileName.substring(pos + 1));
        System.out.println("경로를 포함한 파일명 : " + f.getPath());
        System.out.println("파일 절대 경로 : " + f.getAbsolutePath());
        System.out.println("파일이 속해 있는 디렉토리 : " + f.getParent());
        System.out.println();
        // 리눅스(. , /), 윈도우즈(; , \) 상태에 따라
        System.out.println("File.pathseparator : " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
        System.out.println("File.separator : " + File.separator);
        System.out.println("File.separatorChar : " + File.separatorChar);

    }

}
