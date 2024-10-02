package Conditions;

import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while(KeepRunning){
            try{
                System.out.println("enter a number :");
                int num = sc.nextInt();


               for(int i = 1; i<=10; i++ ){
                   System.out.println( num +"*"+ i +"=" + num *i);

                }
                System.out.println();
            }catch(Exception ex){
                KeepRunning = false;
                System.out.println("exit program" );
            }
        }
    }
}
