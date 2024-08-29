package extendstest;

public class CarEx {
    public static void main(String[] args) {
        // Car 인스턴스 생성
        // Car car = new Car(); (x)

        Car car = new SportsCar();
        car.drive();
        car.stop();

    }

}
