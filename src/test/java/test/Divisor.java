package test;

import java.io.IOException;

public class Divisor {

    public static void main(String args[]) throws IOException {
        int num1 = 15, num2 = 2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}