package poly;

public class Air extends Product {

    public final int price = 0;
    public int bonusPoint;

    public Air() {
        super(100);
    }

    @Override
    public String toString() {
        return "Air conditioner";
    }
}
