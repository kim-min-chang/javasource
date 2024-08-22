package ch4;

public class WhileEx1 {
    public static void main(String[] args) {
        // for (초기화; 조건문; 증감)

        int i = 0;

        while (i < 10) {
            System.out.println("안녕하세요");
            i++;
        }

        i = 0;

        while (i <= 10) {
            System.out.print(i + "\t");
            i++;
        }

    }

}
