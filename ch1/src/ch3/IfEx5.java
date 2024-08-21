package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        // 근무 시간에 따른 임금 계산
        // 근무 시간 입력받기
        // 8 시간 까지 시간당 기본임금(10000)
        // 초과근무시간은 시간당 기본임금 1.5배

        // Scanner sc = new Scanner(System.in);

        // System.out.print("근무시간을 입력해 주세요 >");

        // int time = sc.nextInt();

        // int time2 = 80000;

        // if (time <= 8) {
        // System.out.printf("%d 원 입니다.\n", time * 10000);
        // } else {
        // System.out.printf("%d 원 입니다.\n", (time2 + ((time - 8) * 15000)));
        // }

        int rate = 10000, pay = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("근무시간을 입력해 주세요 >");

        int hours = sc.nextInt();

        if (hours > 8) {
            pay = rate * 8 + (int) (rate * (hours - 8) * 1.5);
            System.out.printf("근무시간: %d, 임금 : %d", hours, pay);
        } else {
            pay = rate * hours;
            System.out.printf("근무시간: %d, 임금 : %d", hours, pay);
        }
        // if (num % 3 == 0) {
        // System.out.println("3의 배수입니다.");
        // } else {
        // System.out.println("3의 배수가 아닙니다.");
        // }
        sc.close();

    }

}
