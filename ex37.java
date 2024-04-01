// Write a Java program to reverse a string.

import java.util.Scanner;

public class ex37{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("Reverse string: " + new StringBuilder(s).reverse().toString());
    }
}