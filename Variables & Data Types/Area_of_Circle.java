
import java.util.Scanner;

//  print area of circle using user input
public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area);
        sc.close();
    }

}
