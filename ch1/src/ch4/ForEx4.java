package ch4;

public class ForEx4 {
    public static void main(String[] args) {
        // 중첩 for
        // for 문 안에 또다른 for 문 포함(for문 중첩 횟수에 제한은 없음.)

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }

        // System.out.println();

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }

        // System.out.println();

        // for (int i = 1; i < 11; i++) {
        // System.out.print("*");
        // }

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for 동작단계
        // 1) int i = 0; 실행
        // 2) i < 2; 실행
        // 3) for 내부 진입
        // 4) int j = 0; 실행
        // 5) j < 2; 실행
        // 6) 안쪽 구문 실행
        // 7) j++ => j < 2; ture 라면 안쪽 구문 실행 false i++

        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 2; j++) {

        // }
        // }

    }

}
