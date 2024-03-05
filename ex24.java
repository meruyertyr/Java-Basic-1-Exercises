// Write a Java program to convert a binary number to an octal number.

import java.util.Scanner;

public class ex24{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter binary: ");
        String b = scan.next();
        int bd = Integer.parseInt(b,2);
        System.out.println("Octal number: " +Integer.toOctalString(bd));
    }
}