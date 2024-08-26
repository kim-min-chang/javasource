public class MyMathEx {
    public static void main(String[] args) {
        Mymath math = new Mymath();

        // 메소드 호출 후 결과 출력
        long result1 = math.add(5L, 3L);
        long result2 = math.subtract(5L, 3L);
        long result3 = math.multiply(5L, 3L);
        double result4 = math.divide(5L, 0L);
        int result5 = math.divide(5, 0);
        System.out.println("add(5L, 3L)" + result1);
        System.out.println("subtract(5L, 3L) " + result2);
        System.out.println("multiply(5L, 3L)" + result3);
        System.out.println("divide(5L, 3L)" + result4);
        System.out.println("divide(5L, 0L)" + result5);

        Mymath2 math2 = new Mymath2(15, 5);
        // 인스턴스 메소드 사칙연산
        System.out.println("15 + 5 = " + math2.add());
        System.out.println("15 - 5 = " + math2.subtract());
        System.out.println("15 * 5 = " + math2.multiply());
        System.out.println("15 / 5 = " + math2.divide());

        // 클래스 메소드 사칙연산
        System.out.println("15 + 5 = " + Mymath2.add(15, 5));
        System.out.println("15 - 5 = " + Mymath2.subtract(15, 5));
        System.out.println("15 * 5 = " + Mymath2.multiply(15, 5));
        System.out.println("15 / 5 = " + Mymath2.divide(15, 5));
    }

}
