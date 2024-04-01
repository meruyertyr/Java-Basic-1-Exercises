// Write a Java program to compare two numbers.

import java.util.Scanner;

public class ex32{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scan.nextInt();

        System.out.print("Enter second integer: ");
        int b = scan.nextInt();

        if(a>b){
            System.out.println(a + " != " +b);
            System.out.println(a + " > " +b);
            System.out.println(a + " >= " +b);
        }
        else if(a<b){
            System.out.println(a + " != " +b);
            System.out.println(a + " < " +b);
            System.out.println(a + " <= " +b);
        }
        else{
            System.out.println(a + " = " +b);
        }
    }
}