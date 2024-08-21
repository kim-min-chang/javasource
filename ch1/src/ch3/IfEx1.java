package ch3;

public class IfEx1 {
    public static void main(String[] args) {
        // 조건문
        // A가 참이면 B를 해주세요.(기본적인 코딩)
        // 조건1 이 참이면 문장1 을 수행, 조건2가 참이면 문장2를 수행
        // if (조건식&&조건식&& 조건식){
        // 수행할 구문;
        // 수행할 구문;
        // 수행할 구문;
        // }

        int num = 50;
        // if(){} : {}를 생략 가능한 경우는 수행할 구문이 하나인 경우만 가능
        if (num < 100) {
            System.out.println("100보다 작다");
        }

        // 100보다 크다 or 100보다 작다
        if (num < 100) {
            System.out.println("100보다 작다");
        } else {
            // if에서 사용된 조건이 아닌 나머지
            System.out.println("100보다 크거나 같다");
        }

        // 점수가 100~90사이일때 등급은 A 입니다.
        // 점수가 89~80사이일때 등급은 B 입니다.
        // 점수가 79~70사이일때 등급은 C 입니다.
        // 점수가 69~60사이일때 등급은 D 입니다.
        // 나머지 점수는 F 입니다.
        int jumsu = 85;

        if (jumsu >= 90) {
            System.out.println("학점 = A");
        } else if (jumsu >= 80) {
            System.out.println("학점 = B");
        } else if (jumsu >= 70) {
            System.out.println("학점 = C");
        } else if (jumsu >= 60) {
            System.out.println("학점 = D");
        } else {
            System.out.println("학점 = F");
        }

        // 조건문은 중첩 가능
        // if (조건1) {
        // if (조건2) {
        // }
        // }
    }

}
