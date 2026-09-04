package If_Else;

import java.util.Scanner;

public class SidesOfaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st sides: ");
        int sides = sc.nextInt();
        System.out.print("Enter 2nd sides: ");
        int sides2 = sc.nextInt();
        System.out.print("Enter 3rd sides: ");
        int sides3 = sc.nextInt();

        if(sides + sides2 > sides3 && sides2 + sides3 > sides && sides + sides3 > sides2){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }




    }
}
