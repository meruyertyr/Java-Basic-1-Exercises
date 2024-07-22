// Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.

import java.util.Scanner;

public class ex64{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Result: "+common_digit(num1, num2));

    }
    public static boolean common_digit(int p, int q){
        if(p<25 || q>75){
            return false;
        }
        int x = p%10;
        int y = q%10;

        p /= 10;
        q /= 10;

        return (p==q || p==y || x==q || x==y);
    }
}