package api;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("문자열 입력하세요");
        // String str = sc.next(); // 안녕하세요 반갑습니다 ==> nextline()
        // System.out.println(str);

        System.out.print("input num1 ");
        int num1 = sc.nextInt(); // 5 엔터 int num1 = Integer.parseInt(sc.nextline())
        System.out.println("+-/* 중 하나를 입력하세요");
        // String op = sc.next();
        String op = sc.nextLine(); // 5 이후 남은 엔터를 읽어드림
        System.out.println("input num2 ");
        int num2 = sc.nextInt();

    }

}
