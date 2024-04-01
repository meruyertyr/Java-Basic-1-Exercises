// Write a Java program to convert a string to an integer.

import java.util.Scanner;

public class ex51{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String n = scan.next();
        int num = Integer.parseInt(n);

        System.out.println("The integer value is: " +num);
    }
}