package ch3;

import java.util.Scanner;

public class SwitchEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 피연산자 2개와 연산2ㅏ 1개를 입력받기
        // 3, 5, * 입력받은 숫자와 연산자로 연산 후 결과를 출력
        System.out.print("연산자(+, -, *, /, %)를 입력해 주세요>");

        String op = sc.nextLine();

        System.out.print("첫번째 숫자를 입력해 주세요>");

        int num1 = sc.nextInt();

        System.out.print("두번째 숫자를 입력해 주세요>");

        int num2 = sc.nextInt();

        // switch (op) {
        // case "+":
        // System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
        // break;
        // case "-":
        // System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
        // break;
        // case "*":
        // System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
        // break;
        // case "/":
        // System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
        // break;
        // case "%":
        // System.out.printf("%d % %d = %d", num1, num2, (num1 % num2));
        // break;
        // }

        int result = 0;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
        }
        System.out.printf("%d %s %d = %d\n", num1, op, num2, result);

        sc.close();
    }

}
