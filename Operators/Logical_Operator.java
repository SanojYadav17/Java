package Operators;

public class Logical_Operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND operator
        System.out.println("a AND b: " + (a && b)); // false

        // Logical OR operator
        System.out.println("a OR b: " + (a || b)); // true

        // Logical NOT operator
        System.out.println("NOT a: " + (!a)); // false
        System.out.println("NOT b: " + (!b)); // true
    }
}
