// Write a Java program to add two binary numbers.

import java.util.Scanner;

public class ex16{
    public static void main(String[] args) {
        long binary1, binary2;
        int i=0, remainder=0;
        int[] sum = new int[20];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        binary1 = scan.nextLong();
        System.out.println("Enter second binary number: ");
        binary2 = scan.nextLong();

        while(binary1!=0 || binary2!=0){
            sum[i++] = (int)((binary1%10+binary2%10+remainder)%2);
            remainder = (int)((binary1%10+binary2%10+remainder)/2);
            binary1 = binary1/10;
            binary2 = binary2/10;
        }
        if(remainder!=10){
            sum[i++]=remainder;
        }
        --i;
        System.out.println("The sum of two numbers: ");
        while(i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println("\n");

    }
}

// import java.util.Scanner;

// public class ex16{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in); 
//         System.out.println("Enter first binary number: ");
//         String b1 = scan.nextLine();

//         System.out.println("Enter second binary number: ");
//         String b2 = scan.nextLine();

//         int n1 = Integer.parseInt(b1,2);
//         int n2 = Integer.parseInt(b2,2);

//         int sum = n1+n2;
//         System.out.println("The binary sum is: " + Integer.toBinaryString(sum));

//     }
// }