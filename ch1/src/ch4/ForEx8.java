package ch4;

public class ForEx8 {
    public static void main(String[] args) {
        // 4x + 5y = 60 을 만족하는 x,y값 출력
        // x,y <= 10 자연수

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }

}
