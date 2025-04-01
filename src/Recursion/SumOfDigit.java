package Recursion;

import java.util.Scanner;
public class SumOfDigit {

    static int digitsum(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
       int ans = digitsum(n/10) ;
        int sumans = n % 10;

        return ans + sumans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitsum(n));
    }
}
