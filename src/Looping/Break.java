package Looping;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int a = 7;

        while(a < 12){
            if(a== 11){
                break;
            }
            System.out.print("value of x is :"+ a);
            a++;
            System.out.println();
        }
    }

    public static class  IntegerInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("input a float value");
           String string_num = sc.nextLine();

            System.out.println("input is :"+ string_num);
        }
    }
}
