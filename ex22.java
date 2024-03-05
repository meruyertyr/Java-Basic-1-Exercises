// Write a Java program to convert a binary number to a decimal number.

import java.util.Scanner;

public class ex22{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Binary num: ");
        String b = scan.nextLine();
        int b1 = Integer.parseInt(b,2);
        System.out.println("Decimal number is: "+b1);
    }
}