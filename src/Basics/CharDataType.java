package Basics;

public class CharDataType {
    public static void main(String[] args) {
        Character ch ='S';
        System.out.println(ch);

        Character Manoj ='M';
        System.out.println(Manoj);

        Character PP ='7';
        System.out.println(PP);

//  typecasting - ek data type se doosra data type conversion pe jana

        char ch3 = 'A';
        int x = ch3; // implicit typecasting
        System.out.println(x);

        char ch1 = 'a';
        int x1 = (int)ch1;  // explicit typecasting
        System.out.println(x1);

        char ch2 = '4';
        System.out.println((int)ch2);

        char ch6 = 'c';
        System.out.println(ch6);

        char ch4 = 'c';
        System.out.println(ch4 * 2);

        char ch5 = 'c';
        System.out.println(ch5 + 2);

//        integer to character
        int x2 = 99;
        char ch7 = (char)x2;
        System.out.println(ch7);
    }
}
