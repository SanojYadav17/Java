import java.util.*; 
public class printSum {
    public static int calculateSum(int num1, int num2) { // parameters or formal parameters
        int Sum = num1 + num2;
        return Sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //arguments or actual parameters
        System.out.println("sum is:" + sum);
    }
}
