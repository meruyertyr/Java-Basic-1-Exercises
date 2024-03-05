//Java Basic Exercises
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class ex6{
    public static void main(String[] args) {
        System.out.println("Input first number: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.println("Input second number: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        int mul = a*b;
        System.out.println(a+" x "+b +" = "+mul);

        int sum = a+b;
        System.out.println(a+" + "+b +" = "+sum);

        int sub = a-b;
        System.out.println(a+" - "+b +" = "+sub);

        int div = a/b;
        System.out.println(a+" / "+b +" = "+div);

        int mod = a%b;
        System.out.println(a+" % "+b +" = "+mod);

    }
}