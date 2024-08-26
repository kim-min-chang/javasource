public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 메소드 호출 => 메소드 실행
        calculator.poweron();

        // retrun 존재시 1) 변수에 담기 2) 사용하기
        int result = calculator.plus(8, 6);
        System.out.println("연산결과 = " + result);
        System.out.println("연산결과 = " + calculator.plus(9, 8));

        double divresult = calculator.divide(9, 2);
        System.out.println("나눗셈 결과 : " + divresult);

        // void 라면 호출만 가능
        // System.out.println(calculator.poweroff());
        calculator.poweroff();

        Calculator2 calculator2 = new Calculator2();
        calculator2.execute();

    }

}
