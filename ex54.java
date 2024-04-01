// Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.

import java.util.Scanner;

public class ex54{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1,num2,num3;
        boolean compare=false;

        System.out.println("Please type in 3 numbers and press enter after each one");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();

        String a=String.valueOf(num1);
        String b=String.valueOf(num2);
        String c=String.valueOf(num3);

        int end_a = a.charAt(a.length()-1);
        int end_b = b.charAt(b.length()-1);
        int end_c = c.charAt(c.length()-1);

        if(end_a == end_b || end_a == end_c || end_b == end_c){
        compare=true;
        }

        System.out.println("The result is: "+compare);
    }
}