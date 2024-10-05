package Methods;

import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name :" );
        String naam = sc.next();
        String personalised = myGreet(naam);
        System.out.print(personalised);
    }

    static String myGreet(String name){
        String message = "hello " + name ;
        return message;
    }



}


