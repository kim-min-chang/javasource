public class GoodsStock {
    // 속성

    private String goodscode; // 상품코드(goodscode) : p1015
    private int stocknum; // 재고수량(stocknum) : 100

    // 생성자
    public GoodsStock(String goodscode, int stocknum) {
        this.goodscode = goodscode;
        this.stocknum = stocknum;
    }

    // 기능
    // 재고추가(addstock) / 재고감소(substock)
    void addstock(int num) {
        stocknum += num;
    }

    int substock(int num) {
        stocknum -= num;
        return stocknum;
    }

    // 상품코드 반환
    public String getGoodscode() {
        return goodscode;
    }

    // 재고수량 반환
    public int getStocknum() {
        return stocknum;
    }
}
