// Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
// Test data:
// Input the first number : 5
// Input the second number: 3
// 2
// Input the first number : 19
// Input the second number: 7
// 5

import java.util.Scanner;

public class ex65{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();

        System.out.println("Enter a second number: ");
        int b = scan.nextInt();

        int divided = a/b;
        int remainder = a - (b*divided);

        System.out.println(remainder);

    }
}