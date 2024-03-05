// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class ex12{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1= scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();
        double ave = ((a1+a2+a3)/3);
        System.out.println(ave);
    }
}