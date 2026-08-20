package Basics;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
//         Area of Circle pi*r*r
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = 3.1415 * r * r;

        System.out.println("Area is : " + area);

    }
}
