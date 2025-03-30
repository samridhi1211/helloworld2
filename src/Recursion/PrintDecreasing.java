package Recursion;
import java.util.Scanner;
public class PrintDecreasing {

    static void printDecrease(int n ){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDecrease(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        printDecrease(n);
    }
}
