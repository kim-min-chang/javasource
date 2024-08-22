package ch4;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // for, while 과 다른점 : {}을 실행한 후 조건식을 검사
        // 최소 한번은 실행이 된다.
        // do {
        // } while (condition);

        // 1 ~ 100사이의 임의의 숫자를 추출한 후 그 숫자를 우리가 맞추기

        Scanner sc = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        do {
            System.out.print("1~100 사이의 숫자 입력>>");
            input = sc.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수를 입력해 주세요.");
            } else if (answer > input) {
                System.out.println("더 큰 수를 입력해 주세요.");
            }
        } while (answer != input);
        System.out.println("정답입니다!");
        sc.close();
    }

}
