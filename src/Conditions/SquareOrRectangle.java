package Conditions;
import java.util.Scanner;
public class SquareOrRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;

        while(KeepRunning){
            try{
                System.out.println("enter length :");
                int l = sc.nextInt();
                System.out.println("enter breadth :");
                int b = sc.nextInt();
                if (l==b){
                    System.out.println("Given rectangle is square");
                }else {
                    System.out.println("Given rectangle is not a square");
                }
            }catch(Exception ex){
                KeepRunning = false;
                System.out.println("exit program");
            }
        }
    }
}
