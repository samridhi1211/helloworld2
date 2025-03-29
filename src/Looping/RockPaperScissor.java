package Looping;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper , 3 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("DRAW");
            } else if (userInput == 0 && computerInput == 1 || userInput == 1 && computerInput == 0 || userInput == 3 && computerInput == 2) {
                System.out.println("YOU WINNN!!!");
            } else {
                System.out.println("COMPUTER WIN ");
            }
//            System.out.println("computer choice :" + computerInput);
        if(computerInput ==0){
            System.out.println("computer choice : ROCK" );
        }else if(computerInput==1){
            System.out.println("computer choice : paper");
        }else if(computerInput ==2){
            System.out.println("computer choice : Gscissor");
        }
        }

    }



