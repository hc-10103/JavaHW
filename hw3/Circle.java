public class Circle {
    private double radius;
    // PI 상숫값 지정하기
    private static final double PI = 3.14;

    // 반지름 데이터 입력 받기
    public Circle(double radius) {
        this.radius = radius;
    }

    // 넓이 리턴하기
    public double getArea() {
        return radius*radius*PI;
    }

    // 둘레 리턴하기
    public double getCircumference() {
        return 2 * PI * radius;
    }





}