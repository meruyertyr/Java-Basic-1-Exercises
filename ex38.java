// Write a Java program to count letters, spaces, numbers and other characters in an input string.

import java.util.Scanner;
public class ex38{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scan.nextLine();

        System.out.println(s);
        count(s);

    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;

        for(int i = 0; i<x.length(); i++){
            if(Character.isLetter(ch[i])){
                letters++;
            }
            else if(Character.isDigit(ch[i])){
                numbers++;
            }
            else if(Character.isSpaceChar(ch[i])){
                spaces++;
            }
            else{
                other++;
            }
        }
        System.out.println("letter: " +letters);
        System.out.println("spaces: " +spaces);
        System.out.println("numbers: "+numbers);
        System.out.println("other: "+other);

    }
}