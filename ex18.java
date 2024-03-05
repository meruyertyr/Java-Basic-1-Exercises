// Write a Java program to multiply two binary numbers.
import java.util.Scanner;

public class ex18{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter first binary number: ");
        String b1 = scan.nextLine();

        System.out.println("Enter second binary number: ");
        String b2 = scan.nextLine();

        int n1 = Integer.parseInt(b1,2);
        int n2 = Integer.parseInt(b2,2);

        int sum = n1*n2;
        System.out.println("The binary sum is: " + Integer.toBinaryString(sum));

    }
}