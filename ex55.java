// Write a Java program to convert seconds to hours, minutes and seconds.

import java.util.Scanner;

public class ex55{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int sec = scan.nextInt();

        int hour = sec/3600;
        int min = (sec - hour*3600)/60;
        int s = sec - (hour*3600 + min*60);


        System.out.println(hour+":" + min+ ":" + s);
    }
}