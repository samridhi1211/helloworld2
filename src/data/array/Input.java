package data.array;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0]=45;
        arr[1]=46;
        arr[2]=465;
        arr[3]=4534;
        arr[4]=4554;

        System.out.println(arr[2]);
//        System.out.println("enter a numbers :");
//        for (int i = 0; i < arr.length; i++) {// run loop to print input
//
//            arr[i] = sc.nextInt();
//
//        }
//        System.out.println( Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {   //run this for loop to print it
//            System.out.print(arr[i]+ " ");
//        }
//       for(int num : arr) {      // for every element in the aray,print elements
//            System.out.print( num + " "); // here num represent the elements of the array
//        }
//        System.out.println(arr[5]);  // index out of bound error

        // Array of objects
        System.out.println("enter here");
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();

        }
        System.out.println(Arrays.toString(str));

        //modify
        str[2] = "kunnu";
        System.out.println(Arrays.toString(str));

    }
}