package TwoDimensionArray;

import java.util.Scanner;

public class multiplyArray {
    static void printArray(int[][] matrix){
        for(int i= 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][] a,int r1,int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("multiplication not possible - wrong dimension");
            return;
        }
        int[][] mul=  new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("multiplication of 2 matrices");
        printArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and coloumn of matrix 1");
        int r1= sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter matrix value");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter number of row and coloumn of matrix 2");
        int r2= sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("enter matrix value");
        for(int i=0; i<r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        printArray(a);
        System.out.println("matrix 2");
        printArray(b);

        multiply(a, r1, c1, b ,r2, c2);
    }

    public static class PrefixSum {
        static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


    //        int n = arr.length;
    //        int[] pref = new int[n];
    //        pref[0] = arr[0];
    //
    //        for (int i = 1; i < n; i++) {
    //            pref[i] = pref[i - 1] + arr[i];
    //        }
    //        return pref;
    //    }
            static int[] makePrefixSumArray(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i-1] + arr[i];
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
            int[] pref = makePrefixSumArray(arr);
            printArray(arr);
        }
    }
}
