package If_Else;
import   java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
//        if(a >= 0){
//            System.out.println(a);
//        }else{
//            System.out.println(-a);
//        }

        if(a < 0) {
            a = -a;
        }
        System.out.println(a);
    }
}
