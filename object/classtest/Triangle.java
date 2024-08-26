public class Triangle {
    // 속성
    private int baseLine; // 밑변(baseLine)
    private int hight;// 높이(hight)

    // 생성자
    public Triangle(int baseLine, int hight) {
        this.baseLine = baseLine;
        this.hight = hight;
    }

    // 기능
    // 삼각형의 너비 구하기

    double getArea() {
        return baseLine * hight / 2.0;
    }

    // 밑변 변화
    public void setBaseLine(int baseLine) {
        this.baseLine = baseLine;
    }

    // 높이 변화
    public void setHight(int hight) {
        this.hight = hight;
    }
}
