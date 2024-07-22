// Write a Java program to accept an integer and count the factors of the number.

import java.util.Scanner;

public class ex57{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int count = 0;
        for(int i =1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println("The number of factor of "+num+" is: "+count);
    }
}