package data.array;

import java.util.Scanner;

public class CopyArray {

    static void printArray(int[]arr){
        for(int i= 0 ;i<arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter size of array");
//        int n = sc.nextInt();  //user se input lenge
        int [] arr = new int[5];
        arr[0]=3421;
        arr[1]= 23;
        arr[2]=24;
        arr[3]=34;
        arr[4]=356;


//        System.out.println("enter "+ n + " elements");
//        for(int i= 0 ;i<arr.length;i++ ) {
//            arr[i] = sc.nextInt();
//        }


        System.out.println("original array");
      printArray(arr);

        // copy arr to arr_2

         int[] arr_2 = arr;
        System.out.println("copied array");
        printArray(arr_2);

        //changing some value of arr_2
        arr_2[0]= 0;
        arr_2[1]=0;

        System.out.println("original array after changing arr_2");
        printArray(arr);

        System.out.println("copy  arr_2 after changing arr_2");
        printArray(arr_2);
    }
}
