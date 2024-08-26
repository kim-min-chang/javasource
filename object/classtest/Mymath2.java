public class Mymath2 {
    // 인스턴스(멤버) 변수
    private long a;
    private long b;

    public Mymath2(long a, long b) {
        this.a = a;
        this.b = b;
    }

    // 인스턴스 메소드
    long add() {
        return a + b;
    }

    long subtract() {
        // subtract(15,5);
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }
    // 클래스 메소드

    static long add(long c, long d) {
        // System.out.println(a);
        // a 변수에 접근 : 1.인스턴스 생성 or 2. a를 static으로 선언
        // Mymath2 math =new Mymath2(15, 8);
        // math.a = 20;
        return c + d;
    }

    static long subtract(long c, long d) {
        return c - d;
    }

    static long multiply(long c, long d) {
        return c * d;
    }

    static long divide(long c, long d) {
        return c / d;
    }

}
