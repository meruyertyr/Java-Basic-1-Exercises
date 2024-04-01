// Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.

import java.util.Scanner;

public class ex53{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int n1 = scan.nextInt();

        System.out.print("Input the second number : ");
        int n2 = scan.nextInt();

        System.out.print("Input the third number : ");
        int n3 = scan.nextInt();

        if(n2>n1 && n3>n2){
            System.out.println("The result is " + true);
        }else{
            System.out.println("The result is " + false);
        }


    }
}