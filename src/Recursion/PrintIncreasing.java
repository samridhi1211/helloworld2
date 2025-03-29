package Recursion;



import java.util.Scanner;
public class PrintIncreasing {
    static void PrintIncrease(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        PrintIncrease(n - 1);
        System.out.println(n);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintIncrease(n);
    }
}

