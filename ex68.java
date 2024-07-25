// Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above.

public class ex68{
    public static void main(String[] args) {
        String main_string = "Python 3.0";

        String last_three_chars = main_string.substring(main_string.length() - 3);

        System.out.println(last_three_chars+last_three_chars+last_three_chars+last_three_chars);
    }
}