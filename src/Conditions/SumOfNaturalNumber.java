package Conditions;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while(KeepRunning)
            try{
                System.out.println("enter a number");
                int n = sc.nextInt();
                int num= 1;
                int sum = 0;
                while(num<= n){
                    sum = sum +num;
                    num++;
                }
                System.out.println(sum);
            }catch(Exception ex){
                KeepRunning = false;
                System.out.println("exit program");
            }

    }
}
