public class Calculator {
    void poweron() {
        System.out.println("전원 켜기");
    }

    int plus(int x, int y) {
        return x + y;
    }

    double divide(int x, int y) {
        // return int => double 자동 형변환
        return (double) x / y;
    }

    void poweroff() {
        System.out.println("전원 끄기");
    }

}
