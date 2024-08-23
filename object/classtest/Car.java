// 자바 - 객체 지향언어
// main() 메소드를 가지는 클래스와 가지지 않는 클래스

// 클래스 정의 : 객체를 정의해 놓은것
// 클래스 용도 : 객체 생성하는데 사용

// 객체 : 사물 또는 개념
public class Car {
    // 특징(속성) => 필드(변수로 작성)
    // 제조사, 모델, 색상, 최대속도
    String company;
    String modle;
    String color;
    int maxSpeed;

    // 기능(동작) = 메소드
    void forward() {
        System.out.println("전진한다.");
    }

    void backword() {
        System.out.println("후진한다.");
    }

}
