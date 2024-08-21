package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1), 바위(2), 보(3)

        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int com = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분

        Scanner sc = new Scanner(System.in);

        System.out.print("가위(1), 바위(2), 보(3) 중에 적어주세요>");

        int user = sc.nextInt();

        switch (user - com) {
            case 1:
            case -2:
                System.out.println("승리");
                break;
            case 0:
                System.out.println("비김");
                break;
            default:
                System.out.println("패배");
                break;
        }
        sc.close();
    }

}
