package Conditions;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter total numbers to compare ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("invalid input exit");
            System.exit(0);
        }

    }
}
