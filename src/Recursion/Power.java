package Recursion;

import java.util.Scanner;
public class Power {
    static int pow(int p , int q) {
//        if(q == 0){
//            return 1;
//        }
//        return pow(p, q-1) * p;
        if (q == 0) {
            return 1;
        }
        if (q % 2 == 0) {
            int smallpow = pow(p, q / 2);
            return smallpow * smallpow;
        }

            int smallpow = pow(p, q / 2);
            return p * smallpow * smallpow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(pow(p, q));
    }
}
