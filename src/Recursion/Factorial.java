package Recursion;

import java.util.Scanner;
public class Factorial {

    static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int ansfact = factorial(n-1);
        int ans = n * ansfact;
      return ans;
//        return n*factorial(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
      
    }
}
