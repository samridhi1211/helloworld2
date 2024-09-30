import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean KeepRunning = true;
        while (KeepRunning) {
            System.out.println("enter a number");
            try {
                int n = sc.nextInt();
                do {
                    n++;
                    if (n == 15) {
                        continue;
                    }
                    System.out.println("value of n :" + n);
                    System.out.println();
                } while (n < 20);
            } catch (Exception ex) {
                KeepRunning = false;
                System.out.println("exit program");
            }
        }
    }
}