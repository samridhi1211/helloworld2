package Conditions;

import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while(KeepRunning){

            try{
                System.out.println("enter cost price:");
                int cp =sc.nextInt();
                System.out.println("enter selling price");
                int sp = sc.nextInt();
                if(sp>cp){
                    System.out.print(" your profit is :");
                    System.out.print(sp-cp);
                }else {
                    System.out.print(" your loss is :");
                    System.out.print(cp-sp);
                }
                System.out.println();

            }catch(Exception ex){
                KeepRunning = false;
                System.out.println("exit program");
            }
        }
    }
}
