// Write a Java program to convert a octal number to a decimal number.

import java.util.Scanner;

public class ex25{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String od = scan.next();
        int d = Integer.parseInt(od,8);
        System.out.println("The decimal : " +d);
    }
}