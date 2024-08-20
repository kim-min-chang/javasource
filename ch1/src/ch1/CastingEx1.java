package ch1;

public class CastingEx1 {
    public static void main(String[] args) {
        // 형변환
        double d = 85.4;
        int score = (int) d;
        System.out.printf("score = %d", score);

        // 큰 -> 작은
        // 작은 : 큰 = 형변환
        // 작은 -> 큰
        // 큰 : 작은 = 자동 형변환
        // 예시 ) byte -> short -> int -> long -> float -> double
        // 예시 ) char -> int -> long -> float -> double

        byte byteValue = 10;
        int intvalue = byteValue;
        System.out.printf("int 형 변환 후 %d\n", intvalue);

        long longvalue = intvalue;
        System.out.printf("long 형 변환 후 %d\n", longvalue);

        double doublevalue = longvalue;
        System.out.printf("double 형 변환 후 %d\n", doublevalue);

        System.out.println("------------------------------");

        char ch = 'a';
        intvalue = ch;
        System.out.printf("int 형 변환 후 %d\n", intvalue);

    }

}
