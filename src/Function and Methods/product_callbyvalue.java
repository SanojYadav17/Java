public class product_callbyvalue {
    public static int multiply(int a, int n) {
        int product = a * n;
        return product;
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 45;
        int pro = multiply(a, b);
        System.out.println("Product of a and b is:" + pro);
        pro = multiply(40, 20);
        System.out.println("Product of 40 and 20 is:" + pro);
    }
}
