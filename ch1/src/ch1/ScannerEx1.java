package ch1;

import java.io.InputStream;
import java.util.*;

public class ScannerEx1 {
    public ScannerEx1(InputStream in) {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // 대문자로 시작하면 class or interface 라고 생각하면 됨
        // Scanner 는 어디에 선언된 클래스인가 알려줘야됨
        // System.in(키보드) 로부터 입력받기 위해 필요한 객체
        // System.out(화면)
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 입력해 주세요 >> ");

        // 25 엔터 =>"25"
        String input = sc.nextLine();
        // "25" => 25로 변경
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num= %d\n", num);

        sc.close();
    }

}
