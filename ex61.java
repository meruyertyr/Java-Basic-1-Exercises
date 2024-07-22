// Write a Java program to reverse a word.

import java.util.*;
public class ex61{
    public static void main(String[] args) {
        System.out.print("Input a word: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        StringBuilder strb = new StringBuilder(s);
        s = strb.reverse().toString();
        System.out.println("Reverse word: "+s);
    }
}