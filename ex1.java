//Java Basic 1 Programming Exercises
//Write a Java program to print 'Hello' on screen and your name on a separate line.

import java.util.Scanner;

public class exercise1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, "+name);
    }
}