public class binomialcoeff {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);
        int binomialCoefficient = fact_n / (fact_r * fact_n_r);
        return binomialCoefficient;
    }
    public static void main(String[] args) {
        System.out.println(binomialCoefficient(10, 2));
        System.out.println(factorial( 10));
    }
}
