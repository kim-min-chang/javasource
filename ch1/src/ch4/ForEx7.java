package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5! 출력 5 * 4 * 3 * 2 * 1

        int fact = 1;
        // for (int i = 5; i > 0; i--) {
        // // System.out.println(i);
        // fact *= i;
        // }

        // System.out.printf("5! = %d", fact);

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해 주세요 >");

        // 숫자 입력 받기

        // 입력받은 숫자의 factorial 구한 후 출력
        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            fact *= i;
        }

        System.out.printf("입력받은 숫자 = %d, %d! = %d", num, num, fact);

        sc.close();
    }

}
