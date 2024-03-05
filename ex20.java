// Write a Java program to convert a decimal number to a hexadecimal number.

import java.util.Scanner;

public class ex20{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = scan.nextInt();
        System.out.println("The converted hexa value is: "+Integer.toHexString(n));

    }
}