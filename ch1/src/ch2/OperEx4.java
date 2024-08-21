package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {
        // 사용자로부터 한달 월급을 입력받은 후 월급을 10년간 저축한 금액이 얼마인지 출력

        // Scanner sc = new Scanner(System.in);

        // System.out.print("월급을 입력해 주세요 = ");

        // int num = sc.nextInt();

        // System.out.printf("10년 저축한 금액 = %d", num * 12 * 10);

        Scanner sc = new Scanner(System.in);

        System.out.print("한달 급여 입력 >> ");

        int salary = sc.nextInt();

        int deposit = salary * 12 * 10;

        System.out.printf("한달월급 = %d, 10년 저축 금액 = %d", salary, deposit);

        sc.close();
    }
}
