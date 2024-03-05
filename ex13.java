//  Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class ex13{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width: ");
        double w = scan.nextDouble();
        System.out.println("Height: ");
        double h = scan.nextDouble();
        System.out.println("Area is " +(w*h));
        System.out.println("Perimeter is " + 2*(w+h));
    }
}