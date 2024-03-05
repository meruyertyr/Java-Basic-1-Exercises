// Write a Java program to convert a hexadecimal number into a binary number.

import java.util.Scanner;

public class ex29{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hd = scan.next();
        int d = Integer.parseInt(hd,16);
        System.out.println("Equivalent Binary Number is: " +Integer.toBinaryString(d));
    }
}