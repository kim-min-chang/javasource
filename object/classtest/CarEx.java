public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 맴버 변수, 메소드 접근 가능
        printCar(car);

        // 속성 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.modle = "소나타";

        printCar(car);

        car.forward(); // 전진한다.
        car.backword(); // 후진한다.

        // Car cars[] = new Car[2];
        // NullPointerException : 객체 => new 아직 안한 상황
        // System.out.println(cars[0].color);

        // String 초기화
        // String str = "" / String str = null
        String str = ""; // 빈문자열
        // NullPointerException
        // System.out.println(str.length());

    }

    static void printCar(Car car) {
        System.out.println("제조사 : " + car.company);
        System.out.println("모델 : " + car.modle);
        System.out.println("색상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);

    }
}
