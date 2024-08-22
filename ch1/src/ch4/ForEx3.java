package ch4;

public class ForEx3 {
    public static void main(String[] args) {
        // 구구단 5단 출력

        for (int i = 1; i < 10; i++) {
            System.out.printf("5 * %d = %2d\n", i, (5 * i)); // %2d = 2자리 수로 출력
        }
    }

}
