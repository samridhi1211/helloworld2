package Looping;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
     boolean flag = true;
     int a = 123;
     short s= 12;
     byte b = 23;
     long l = 246543287;
     float f = 456.34f;
     double d = 76.78;
     char ch = 'd';

        System.out.println("boolean"+flag);
        System.out.println("integer"+a);
        System.out.println("short"+s);
        System.out.println("byte"+b);
        System.out.println("long"+l);
        System.out.println("float"+ f);
        System.out.println("double"+ d);
        System.out.println("char: " + ch);



    }

    public static class Looping {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("How many number would you like to compare  : ");
            int n = scanner.nextInt();
            if(n <=0){
                System.out.println("Invalid input exiting program ");
                System.exit(0);
            }

            int[] numbers = new int[n];
            while (n != 0) {
                n -=1;
                numbers[n] = scanner.nextInt();
            }

            int max = numbers[0];
            for(int i =1; i < numbers.length; i++){
                if(max < numbers[i]){
                    max = numbers[i];
                }
            }
            System.out.println("Max number is = "+max);
        }
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }
        }
    }

    public static class Operator {
        public static void main(String[] args) {

            System.out.println(4+2+"pqr");
            System.out.println("pqr"+4+2);

    //        System.out.println(++q);
    //        System.out.println(q);
    //
    //        int x= p++;
    //        int z= ++q;
    //        System.out.println(x);
    //        System.out.println(z);
    //
    //        System.out.println(p);
    //        System.out.println(q);
    //    }
    }   }
}
