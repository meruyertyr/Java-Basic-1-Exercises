// Write a Java program to convert a string into lowercase.

import java.util.Scanner;

public class ex59{
    public static void main(String[] args) {
        System.out.print("Enter a Sentence: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] word = str.split(" ");
        for(String s:word){
            System.out.print(Character.toLowerCase(s.charAt(0)) + s.substring(1, s.length()) +" ");
        }
    }
}