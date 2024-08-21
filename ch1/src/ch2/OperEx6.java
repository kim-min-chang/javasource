package ch2;

public class OperEx6 {
    public static void main(String[] args) {

        // 논리연산자 : &&(and), ||(or), !(not)
        // true && true , true || true => true
        // true && false => false , true || false => 결과는 true
        // && : 모든조건이 true 일때만 true -> 중간에 false가 섞이면 그뒤는 검사x
        // || : 한 조건이라도 true 일때 true -> 중간에 true가 섞이면 그뒤는 검사x

        int value = 6;

        // value 가 2의 배수인지 or 3의 배수인지 확인
        // 2 또는 3의 배수 라고 출력하기

        // System.out.println((value % 2 == 0) || (value % 3 == 0));

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2또는 3의 배수");
        }
        if ((value % 2 == 0) && (value % 3 == 0)) {
            System.out.println("2와 3의 배수");
        }

        char ch1 = 'A';
        System.out.println(ch1 >= 'A');
        System.out.println(ch1 <= 'Z');

        // ch1 이 대문자 라면 ch1 은 대문자 입니다. 출력
        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println("ch1 은 대문자 입니다.");
        }

    }

}
