package shop;

public class ShopEx {
    public static void main(String[] args) {
        // MyShop shop = new MyShop();
        // 리스트
        MyShop2 shop = new MyShop2();

        // 상점 이름 지정
        shop.setTitle("MyShop");

        // user생성
        shop.genUser();

        // 상품생성
        shop.genProduct();

        // 상점시작
        shop.start();

    }

}
