import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = sc.nextDouble();
        double squareArea = side * side;
        System.out.println("Area of the square: " + squareArea);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + circleArea);

        sc.close();
    }
}
