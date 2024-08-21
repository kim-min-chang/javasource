package ch2;

public class OperEx2 {
    public static void main(String[] args) {
        // 단항연산자
        // 1) 부호 연산자 : -,+
        // 2) 증감 연산자 : --, ++ (증감) , 앞으로 오면 연산이 먼저 실행됨, 뒤에 오면 대입이 먼저 되고 연산이 됨
        // 단, 독립적 하나의 문장으로 사용되는경우에는 전 후 상관없음.
        // 3) 논리 부정 연산자 : !

        int x = 10;

        // x = x + 1;

        // x++;

        // System.out.println("x = " + x);
        // System.out.println("x = " + (++x)); // 11
        System.out.println("x = " + (x++)); // 10

        // x = x-1

        // x--;

        // System.out.println("x = " + x);
        // System.out.println("x = " + (--x)); // 10
        System.out.println("x = " + (x--)); // 11

        boolean play = true;
        System.out.println(!play);

    }

}
