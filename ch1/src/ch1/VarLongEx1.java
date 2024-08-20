package ch1;

public class VarLongEx1 {
    public static void main(String[] args) {
        // L,l 상관없음(생략가능)
        long value = 123456789;

        value = 10000000000l;

        // print 안의 +는 연결의 의미(""와 붙었을때만)
        System.out.println("value = " + value);
        // 정수끼리 붙은 +는 산술연산
        System.out.printf("value + value = %d", value + value);
    }

}
