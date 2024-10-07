package data.array;
import java.util.Scanner;
public class FindMinimum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("minimum numbers to be compared?");
        int n =sc.nextInt();
        while(n<=0){
            System.out.println("invalid number");
        }
        int []numbers = new int[n];
        while(n !=0){
            n--;
            System.out.println("enter numbers");
            numbers[n] = sc.nextInt();
        }
        int min = numbers[0];
        for(int i =0;i<numbers.length; i++){
            if(min > numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("minimum number :" + min);


    }
    // array of numbers
    // find the minimum 
}
