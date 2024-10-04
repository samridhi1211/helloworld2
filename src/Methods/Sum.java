package Methods;
import java.util.Scanner;
public class Sum {
    public static void main(StringExample[] args) {
        int ans =  sum2();
        System.out.println(ans);

    }
     static int sum2() {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a number :");
         int num1 = sc.nextInt();
         System.out.println("enter a number :");
         int num2 = sc.nextInt();
         int sum = num1+num2;
         return sum;
     }
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num1 = sc.nextInt();
        System.out.println("enter a number :");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum is :"+sum);
    }



}
