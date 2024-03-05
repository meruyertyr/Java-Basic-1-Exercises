// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class ex11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println(perimeter);
        System.out.println(area);
    }
}