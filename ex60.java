// Write a Java program to find the penultimate (next to the last) word in a sentence.

import java.util.Scanner;

public class ex60{
    public static void main(String[] args) {
        System.out.print("Input a String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(" ");

        System.out.print("Penultimate word: " +words[words.length - 2]);
    }
}