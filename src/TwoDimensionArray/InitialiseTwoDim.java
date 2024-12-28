package TwoDimensionArray;

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

    public static class SuffixSum {
        static void printArray(int[] arr){
            int n = arr.length;
            for(int i= 0; i< n ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        static  int[] suffixSum(int[] arr){
            int n = arr.length;                                    //NEED TO WORK ON CODE
            for (int i = n - 2; i >= 0; i--) {
                arr[i] = arr[i] +arr[i + 1];
            }
            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter array size :");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter" + n + "element");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("original array");
            printArray(arr);
            int[] suffix= suffixSum(arr);
            printArray(arr);

        }
    }
}

