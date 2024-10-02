package Conditions;
import java.util.Scanner;
import java.util.maths.pow;
public class PointOnACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while(KeepRunning) {
            try{
                System.out.println("enter a number");
                int x = sc.nextInt();
                System.out.println("enter a number");
                int y = sc.nextInt();
                System.out.println("enter radius");
                int r = sc.nextInt();
                System.out.println("enter a number");
                int x1 = sc.nextInt();
                System.out.println("enter a number");
                int y1 = sc.nextInt();
                int OA**2 =( (x-x1)**2 + (y-y1)**2);
                if(OA**2 >r**2){
                    System.out.println("point lies outside the circle");
                }else if (OA**2 <r**2){
                    System.out.println("point lies inside the circle");
                }else if(OA**2==r**2){
                    System.out.println("point lies on the circle");
                }

            }catch(Exception ex){
                KeepRunning= false;
                System.out.println("exit  program");
            }
        }
    }
}
