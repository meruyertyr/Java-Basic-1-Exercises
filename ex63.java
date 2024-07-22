// Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.

import java.util.Scanner;

public class ex63{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1>num2 && ( num1%6==1 || num2%6==1)){
            System.out.println("Result: " +num1);
        }
        else if(num1<num2 && ( num1%6==1 || num2%6==1)){
            System.out.println("Result: " +num2);
        }
        else if(num1==num2 && ( num1%6==1 || num2%6==1)){
            System.out.println("Result: " +0);
        }
        else if(num1%6==num2%6){
            if(num1>num2){
                System.out.println("Result: " +num2);
            }else{
                System.out.println("Result: " +num1);
            }
        }
        else{
            System.out.println("This is not correct numbers");
        }
    }
}