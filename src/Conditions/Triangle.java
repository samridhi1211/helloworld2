package Conditions;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while (KeepRunning) {
            try {
                System.out.println("enter a numbers");
                int a = sc.nextInt();
                System.out.println("enter a number");
                int b = sc.nextInt();
                System.out.println("enter a number");
                int c = sc.nextInt();

                if (a + b > c && b + c > a && c + a > b) {
                    System.out.println("valid triangle");
                } else {
                    System.out.println("invalid triangle");
                }


            } catch (Exception ex) {
                KeepRunning = false;
                System.out.println("exit ");
            }
        }
    }
}









