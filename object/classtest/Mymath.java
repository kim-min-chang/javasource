public class Mymath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    // 메소드 오버로딩
    double divide(double a, double b) {
        return a / b;
    }

    int divide(int a, int b) {
        // b가 0인지 확인한 후
        if (b == 0) {
            System.out.println("0으로 나눌수 없습니다.");
            return 0;
        }
        return a / b;
    }

    // a,b 중에서 큰수 리턴
    int max(int a, int b) {
        // if (a > b) {
        // return a;
        // } else {
        // return b;
        // }

        // return a > b ? a : b;

        if (a > b) {
            return a;
        }
        return b;
    }

    void print() {
        return;
    }

}
