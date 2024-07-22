// Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions.

import java.util.Scanner;

public class ex62{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println((Math.abs(num1-num2)>=20 || Math.abs(num2-num3)>=20 || Math.abs(num3-num1)>=20));
    }
}