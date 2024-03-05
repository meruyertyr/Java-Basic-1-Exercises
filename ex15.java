// Write a Java program to swap two variables.

import java.util.Scanner;

public class ex15{
    public static void main(String[] args) {
        int z;
        //z=temporary value
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scan.nextInt();
        System.out.print("Enter second number: ");
        int y = scan.nextInt();

        z=x;
        x=y;
        y=z;

        System.out.println("The swapped values: " + x+ " and "+y);


    }
}