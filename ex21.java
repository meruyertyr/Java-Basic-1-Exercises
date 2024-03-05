// Write a Java program to convert a decimal number to an octal number.

import java.util.Scanner;

public class ex21{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = scan.nextInt();
        System.out.println("The converted octal number is: " +Integer.toOctalString(n));
    }
}