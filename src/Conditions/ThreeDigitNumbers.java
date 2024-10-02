package Conditions;
import java.util.Scanner;

public class ThreeDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while(KeepRunning){
            try{
                System.out.println("enter a number");
                int n = sc.nextInt();
                if(n>99 && n<1000){
                    System.out.println("three digit number");
                }else {
                    System.out.println("not three digit numbers");
                }
            }catch(Exception ex){
                KeepRunning = false;
                System.out.println("exit program");
            }
        }
    }
}
