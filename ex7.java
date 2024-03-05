//Java Basic Exercises
//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class ex7{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i =0; i<10;i++){
            System.out.println(num+" x "+(i+1)+" = "+(num*(i+1)));

        }

    }
}