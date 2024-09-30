package Conditions;
import java.util.Scanner;

public class AreaPerimeterGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;

        while (KeepRunning){
            try{
                System.out.println("enter a length :" );
                int l = sc.nextInt();
                System.out.println("enter a breadth :" );
                int b = sc.nextInt();
                int perimeter = 2*(l+b);
                int area = l*b;
                if(area > perimeter){
                    System.out.println("area  is greater than perimeter");
                }else if(perimeter == area) {
                    System.out.println(" both perimeter and area are equal");
                }else {
                    System.out.println("perimeter is greater than area");
                }
            }catch(Exception ex){
                KeepRunning = false;
                System.out.println("exit program");
            }
        }
    }
}
