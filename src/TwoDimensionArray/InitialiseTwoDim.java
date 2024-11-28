package TwoDimensionArray;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InitialiseTwoDim {

    //2-d array recieve and print :: (printArray)
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){        //array to array implementation 1st loop for ROW , 2nd loop for COLOUMN
//            System.out.print(arr[i]);
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of row");
        int r = sc.nextInt();
        System.out.println("enter no. of coloumn");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("enter" +r*c+ "element");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        int[][] arr2 = {
//                         {1,2,3} ,
//                         {4,5,6} ,
//                         {4,8,9}
//                          };
        printArray(arr);
    }

}

