// Write a Java program to print the ASCII value of a given character.

import java.util.Scanner;

public class ex41{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);
        int i = ch;
        System.out.println("ascii value is: " + i);
    }
}