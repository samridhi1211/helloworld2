package Conditions;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

         Boolean KeepRunning = true;
         while(KeepRunning){
             System.out.println("enter a number :");
             try {
                 int n = sc.nextInt();
                 if(n %2== 0){
                     System.out.println("even number" +n);
                 }else {
                     System.out.println("odd number" + n);
                 }
                 }catch(Exception ex){
                     KeepRunning = false;
                     System.out.println("exit program");
             }
         }

    }
}
