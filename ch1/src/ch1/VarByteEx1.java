package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        // 프로그램에서 구현할 부분을 코드로 작성
        // 나이와 이름
        // 변경되는 부분은 변수로 작성
        // 변수 선언 후 사용 : 타입 변수명 = 초기값;
        // 타입 : 정수형, 실수형, 문자형, 논리형
        // 정수형 byte, short, int, long
        // 실수형 float, double
        // 문자형 char
        // 논리형 boolean

        // 변수 선언 후 초기화
        int age = 31;
        String name = "김민창";
        // 초기화된값 변경
        age = 40;

        // print() 화면출력
        // println() : 화면 출력 후 엔터까지 포함
        // printf() : 포맷을 적용한 출력(엔터 포함x)
        // \n = enter \t = tap
        System.out.print("제 나이는 " + age + "이고, 이름은 " + name + " 입니다\n");

        age = 10;

        System.out.println("제 나이는 " + age + "이고, 이름은 " + name + " 입니다");
        System.out.printf("제 나이는 %d 이고, 이름은 %s 입니다.\n", age, name);
        System.out.println("안녕하세요");
    }

}
