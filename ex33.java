// Write a Java program and compute the sum of an integer's digits.

import java.util.Scanner;

public class ex33{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer: ");
        long n = scan.nextLong();

        System.out.println("The sum of digits: " + sumDigits(n));
    }

    public static int sumDigits(long n){
        int sum =0;

        while(n!=0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}