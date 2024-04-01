// Write a Java program to input and display your password.

import java.util.Scanner;

public class ex42{
    public static boolean yes = false;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(yes==false){
            System.out.print("Enter your password: ");
            String password1 = scan.next();
        
            System.out.print("Confirm your password: ");
            String password2 = scan.next();

            if(password1.equals(password2)){
                System.out.println("Do you want to see your password? If yes, enter y. If not, enter any character: ");
                if(scan.hasNext("y")){
                    yes=true;
                    System.out.println(password1);
                }
                else{
                    yes = true;
                    System.out.println("thanks for storing your password");
                }
            }
            else{
                System.out.println("passwords do not match. Please retry entry\n");
            }
        }

    }
}