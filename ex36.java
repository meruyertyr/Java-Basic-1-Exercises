// Write a Java program to compute the distance between two points on the earth's surface.
// Distance between the two points [ (x1,y1) & (x2,y2)]
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Radius of the earth r = 6371.01 Kilometers

import java.util.Scanner;

public class ex36{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = scan.nextDouble();

        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = scan.nextDouble();

        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = scan.nextDouble();

        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = scan.nextDouble();

        System.out.println("The distance between those points is: "+distance_between_points(lat1, lon1, lat2, lon2) + " km");
    }
    public static double distance_between_points(double lat1, double lon1, double lat2, double lon2){
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double r = 6371.01;

        return r * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}