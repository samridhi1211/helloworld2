import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter name");



        String name = sc.next();
        System.out.println("name:"+name);

        System.out.println("enter lucky number");
        int num_1 =sc.nextInt();

        System.out.println("lucky no."+num_1);
    }
}
