package io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileEx3 {

    static String totalFiles;
    static String totalDirs;

    public static void main(String[] args) {

        File f = new File("c:\\temp");

        if (!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);

        }
        printFileList(f);
        System.out.println();
        System.out.println("총 " + totalFiles + "개의 파일");
        System.out.println("총 " + totalDirs + "개의 디렉토리");

    }

    public static void printFileList(File f) {

        System.out.println(f.getAbsolutePath() + "디렉토리");
        // 폴더 접근 후 파일 읽어
        File[] files = f.listFiles();

        // 디렉토리라면 List에 추가하기
        List<String> subDir = new ArrayList<>();

        // 리스트 사이즈를 구해서 totalDirs

        for (int i = 0; i < files.length; i++) {
            String filename = files[i].getName();
            if (files[i].isDirectory()) {
                filename = "[" + filename + "]";
                subDir.add(i + "");
            }
            System.out.println(filename);
        }

        int dirNum = subDir.size();
        int fileNum = files.length - dirNum;

        totalFiles += fileNum;
        totalDirs += dirNum;
        System.out.println(fileNum + "개의 파일, " + dirNum + "개의 디렉토리");
        System.out.println();

        for (int j = 0; j < subDir.size(); j++) {
            int index = Integer.parseInt(subDir.get(j));
            printFileList(files[index]);
        }

    }

}
