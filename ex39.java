// Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.

public class ex39{
    public static void main(String[] args) {
        int amount = 0;

        for(int i =2; i<=6; i++){
            for(int j=2; j<=6; j++){
                for(int k=2; k<=6; k++){
                    for(int h=2; h<=6; h++){
                        if(k!=i && k!=j && i!=j && k!=h && h!=j && h!=i){
                            amount++;
                            System.out.println(i+""+j+""+k+""+h);
                        }
                    }
                }
            }
        }
        System.out.println("Total number of the three digit number is: "+amount);
    }
}