// Write a Java program to compute hexagon area.
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
// where s is the length of a side

import java.util.Scanner;

public class ex34{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = scan.nextDouble();

        double area = (6 * Math.pow(s, 2))/(4*Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is: " +area);
    }
}