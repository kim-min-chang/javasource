package ch2;

public class OperEx7 {
    public static void main(String[] args) {
        // 복합 대입 연산자
        int result = 10;

        result += 10; // result = result + 10;
        System.out.println("result = " + result);

        result -= 5; // result = result - 5;
        System.out.println("result = " + result);

        result *= 3;// result = result * 3;
        System.out.println("result = " + result);

        result /= 3;// result = result / 3;
        System.out.println("result = " + result);

        // 삼항연산자
        // 조건식 ? 식1 : 식2;
        int score = 85;
        // score = 90 이상이면 A, 아니면 B 출력
        // char ch2 = score >= 90 ? 'A' : 'B';
        System.out.println("학점 : " + (score >= 90 ? 'A' : 'B'));

        // score = 90 이상이면 A, 80이상이면 B 출력, 아니면 C 출력
        // 조건식1 ? 식1 : (조건식2) ? 식1 : 식2
        System.out.println("학점 : " + (score >= 90 ? 'A' : score >= 80 ? 'B' : 'C'));
    }

}
