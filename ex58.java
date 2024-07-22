// Write a Java program to capitalize the first letter of each word in a sentence.

import java.util.Scanner;

public class ex58{
    public static void main(String[] args) {
        System.out.print("Enter a Sentence: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] word = str.split(" ");
        for(String s:word){
            System.out.print(Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()) +" ");
        }


    }
}