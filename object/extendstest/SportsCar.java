package extendstest;

public class SportsCar extends Car {

    private static final String name = null;

    public SportsCar() {
        super(name);
    }

    @Override
    void drive() {
        throw new UnsupportedOperationException("스포츠카가 달립니다.");
    }

}
