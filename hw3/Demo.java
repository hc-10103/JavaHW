// 22500819 안희찬 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 반지름 입력받기
        System.out.print("Enter the first radius: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter the second radius: ");
        double r2 = sc.nextDouble();

        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);

        double area1 = c1.getArea();
        double area2 = c2.getArea();

        double circ1 = c1.getCircumference();
        double circ2 = c2.getCircumference();

        // #.## 형식을 이용하여 소수점 둘째 자리까지 표현, 마지막이 .#0일 경우 .#만 표현
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("First circle: The area is " + df.format(area1) + " and the circumference is " + df.format(circ1) + ".");
        System.out.println("Second circle: The area is " + df.format(area2) + " and the circumference is " + df.format(circ2) + ".");
        System.out.println("The ratio of the areas is " + df.format(area1 / area2) + ".");
    }
}