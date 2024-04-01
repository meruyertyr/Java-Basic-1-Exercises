// Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.

import java.util.Scanner;

public class ex49{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scan.nextInt();

        if(n%2!=0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
