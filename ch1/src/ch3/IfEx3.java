package ch3;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 점수를 입력 받아서 90 이상이면 A, 98이상이면 A+, 94이상이면A0, 94미만이면 A-
        // 80 이상이면 B, 88이상이면, B+ 84이상이면 B0, 84 미만이면 B-

        char grade = ' ', opt = '0';

        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요 > ");

        int jumsu = sc.nextInt();

        if (jumsu >= 90) {
            grade = 'A';
            if (jumsu >= 98) {
                opt = '+';
            } else if (jumsu < 94) {
                opt = '-';
            }
        } else if (jumsu >= 80) {
            grade = 'B';
            if (jumsu >= 88) {
                opt = '+';
            } else if (jumsu < 84) {
                opt = '-';
            }
        } else if (jumsu >= 70) {
            grade = 'C';
            if (jumsu >= 78) {
                opt = '+';
            } else if (jumsu < 74) {
                opt = '-';
            }
        } else if (jumsu >= 60) {
            grade = 'D';
            if (jumsu >= 68) {
                opt = '+';
            } else if (jumsu < 64) {
                opt = '-';
            }
        }

        System.out.printf("점수 : %d, 학점 : %c%c\n", jumsu, grade, opt);
        sc.close();
    }
}
