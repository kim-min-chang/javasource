package shop;

public abstract class Product {
    private String pName;
    private int price;
    public Object resolution;
    public Object carrier;

    public Product(String pName, int price) {
        this.pName = pName;
        this.price = price;
    }

    void printDetail() {
        System.out.println("제품명 : " + pName);
        System.out.println("제품가격 : " + price);
        printExtra();
    }

    // 제품에 따라서 추가 정보 출력
    abstract void printExtra();

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

}
