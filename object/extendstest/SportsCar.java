package extendstest;

public class SportsCar extends Car {

    public SportsCar(String name) {
        super(name);
    }

    @Override
    void drive() {
        throw new UnsupportedOperationException("스포츠카가 달립니다.");
    }

}
