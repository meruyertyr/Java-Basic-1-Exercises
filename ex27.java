// Write a Java program to convert a octal number to a hexadecimal number.

import java.util.Scanner;

public class ex27{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String od = scan.next();
        int hd = Integer.parseInt(od,8);
        System.out.println("Equivalent hexadecimal number: " +Integer.toHexString(hd));
    }
}