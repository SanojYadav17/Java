package Basics;

import java.util.Scanner;

public class Principleintrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter P value: ");
        double p = sc.nextInt();
        System.out.print("Enter Q value: ");
        double r = sc.nextInt();
        System.out.print("Enter R value: ");
        double t = sc.nextInt();

        double simpleinterest = p*r*t/100;
        System.out.println("Simple interest is: " + simpleinterest);
    }
}
