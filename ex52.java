// Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

import java.util.Scanner;

public class ex52{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int n1 = scan.nextInt();

        System.out.print("Input the second number : ");
        int n2 = scan.nextInt();

        System.out.print("Input the third number : ");
        int n3 = scan.nextInt();

        if(n1+n2==n3){
            System.out.println("The result is " + true);
        }
        else{
            System.out.println("The result is " + false);
        }
    }
}