// Write a Java program to convert an integer number to a binary number.

import java.util.Scanner;

public class ex19{
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int n = scan.nextInt();
        System.out.println("The converted binary number: "+Integer.toBinaryString(n));
        
    }
}