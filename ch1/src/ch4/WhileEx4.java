package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0; // 잔액

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("=============================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("=============================================");
            System.out.println("메뉴 번호 입력 >");
            int menu = sc.nextInt();

            switch (menu) {
                case 1: // 잔액 = 잔액 + 입금액
                    System.out.println("입금액을 입력해 주세요");
                    int money = sc.nextInt();
                    balance += money;
                    System.out.println("입금 후 잔액 = " + balance);
                    break;

                case 2: // 잔액 = 잔액 - 출금액
                    System.out.println("출금액을 입력해 주세요");
                    int money2 = sc.nextInt();
                    balance -= money2;
                    System.out.println("출금 후 잔액 = " + balance);
                    break;

                case 3:// 잔액 출력
                    System.out.println("현재잔액 = " + balance);
                    break;

                case 4:
                    run = false;
                    break;
            }
        }
        sc.close();
    }

}
