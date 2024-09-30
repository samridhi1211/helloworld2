package Conditions;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        while(keepRunning) {
            System.out.println("enter a number : ");
            try {
                int n = sc.nextInt();
                if (n < 0) {
                    n = n * (-1);
                }
                System.out.println("absolute value :"+ n);
            }catch(Exception ex){
                keepRunning = false;
                System.out.println("Exiting program ");
            }
        }

    }
}
