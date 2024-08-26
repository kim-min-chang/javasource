public class Circle {
    // 클래스 내에 선언 순서 상관없음
    // 속성 -> 생성자 -> 메소드 순으로 주로 함
    // 속성
    // 반지름(radius) : 3.5

    // 기능
    // 원의 넓이 : 반지름 * 반지름 * 3.14

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
