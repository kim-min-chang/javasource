package ch4;

public class WhileEx3 {
    public static void main(String[] args) {
        while (true) {
            // 주사위 2개를 굴려 두개의 합이 5와 같을때 종료
            int d1 = (int) (Math.random() * 6) + 1;
            int d2 = (int) (Math.random() * 6) + 1;

            System.out.printf("%d, %d\n", d1, d2);

            if ((d1 + d2) == 5) {
                break;
            }
        }
    }

}
