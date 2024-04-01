// Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

import java.util.Scanner;

public class ex44{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scan.nextInt();

        System.out.println(n+" + "+n+n+" + "+n+n+n);
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
    }
}