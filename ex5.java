//Java Basic Exercises
//Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
        System.out.println("Input first number: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.println("Input second number: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        int res = a*b;
        System.out.println(a+" x "+b +" = "+res);
    }
}
