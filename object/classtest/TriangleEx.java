public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7);

        System.out.println("삼각형의 넓이 = " + triangle.getArea());

        // 밑변, 높이 숫자 변경
        // triangle.baseline = 15;
        triangle.setBaseLine(15);
        System.out.println("삼각형의 넓이 = " + triangle.getArea());

        triangle.setBaseLine(10);
        triangle.setHight(8);
        System.out.println("삼각형의 넓이 = " + triangle.getArea());
    }

}
