// Write a Java program to convert a binary number to a hexadecimal number.

import java.util.Scanner;

public class ex23{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String b = scan.next();
        int bd = Integer.parseInt(b,2);
        System.out.println("Hexa number is: "+Integer.toHexString(bd));
    }
}