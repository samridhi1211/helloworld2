package data.array;

import java.util.Scanner;


public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//     int [][] arr= {
//             {1, 2, 3},
//             {2, 3},
//             {5, 6, 7, 8}
//     };
     int[][] arr = new int[3][3];
        System.out.print(arr.length);

     //input
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
     }
        // outputs
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }

    }

}
