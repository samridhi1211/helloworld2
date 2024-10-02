package Conditions;
import java.util.Scanner;
public class ThreePointsOnStraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while (KeepRunning) {
            try {

            System.out.println("enter a number");
                double x1 = sc.nextDouble();
                System.out.println("enter a number");
                double x2 = sc.nextDouble();
                System.out.println("enter a number");
                double x3 = sc.nextDouble();
                System.out.println("enter a number");
                double y1 = sc.nextDouble();
                System.out.println("enter a number");
                double y2 = sc.nextDouble();
                System.out.println("enter a number");
                double y3 = sc.nextDouble();
                double m1 = (y2 - y1) / (x2 - x1);
                double m2 = (y3 - y2) / (x3 - x2);
                if (m1 == m2) {
                    System.out.println("Three points on a straight line ");
                } else {
                    System.out.println("They do not lie on a straight line");
                }


            } catch (Exception ex) {
                KeepRunning = false;
                System.out.println("exit pogram");
            }
        }
    }
}
