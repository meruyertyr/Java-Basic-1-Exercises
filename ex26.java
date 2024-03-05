// Write a Java program to convert a octal number to a binary number.

import java.util.Scanner;

public class ex26{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String od = scan.next();
        int bd = Integer.parseInt(od,8);
        System.out.println("Equivalent binary number: " +Integer.toBinaryString(bd));
    }
}