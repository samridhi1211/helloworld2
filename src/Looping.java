import java.util.Scanner;

public class Looping {
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
