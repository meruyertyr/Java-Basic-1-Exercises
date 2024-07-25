// Write a Java program to insert a word in the middle of another string. Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.

public class ex67{
    public static void main(String[] args) {
        String main = "Python 3.0";
        String word = "Tutorial";

        String result = main.substring(0, 7) + word + main.substring(5);
        System.out.println(result);
    }
}