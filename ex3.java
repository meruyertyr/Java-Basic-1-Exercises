//Java Basic Exercises
//Write a Java program to divide two numbers and print them on the screen.

import java.util.Scanner;

public class ex3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int r = a1/a2;
        System.out.println(r);
    }
}