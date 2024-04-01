// Write a Java program to compute the area of a polygon.
// Area of a polygon = (n*s^2)/(4*tan(π/n))
// where n is n-sided polygon and s is the length of a side

import java.util.Scanner;

public class ex35{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        double n = scan.nextDouble();

        System.out.print("Input the length of one of the sides: ");
        double s = scan.nextDouble();
        System.out.println("The area is: "+areaOfPolygon(n, s));
  

    }
    public static double areaOfPolygon(double n, double s){
            return (n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
        }
}