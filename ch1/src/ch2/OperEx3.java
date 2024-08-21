package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때
        // 학생 한명당 몇개를 나눠가질수 있고 몇개가 남는지 출력하기
        // 조건 ) 변수 사용

        int pen = 534;

        int stu = 30;

        System.out.printf("연필의 갯수 = %d, 학생의 수 %d\n", pen, stu);

        System.out.printf("학생 한명당 받는 연필의 수 = %d\n", pen / stu);

        System.out.printf("학생들이 연필을 가진 후 남은 연필의 수 = %d\n", pen % stu);

        // 사다리꼴의 넓이 구하기
        // 윗변 : 5 아랫변 : 10 높이 7
        // 조건) 변수사용 , 소수자리 수까지 출력

        int top = 5;
        int bottom = 10;
        int h = 7;

        double result = (top + bottom) * h / 2.0;

        System.out.printf("사다리꼴의 넓이 구하기 = %.1f", result);

        // 변수 num 의 값보다 크면서 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하라
        // 예를 들어 24 라면 24보다 크면서 가장 가까운 10의 배수 30-24=6으로 결과가 6이 나오도록

        int num = 53;

        System.out.print(10 - (num % 10));

    }

}
