package Arrays;

import java.util.Scanner;

public class SuffixSum {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i= 0; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static  int[] suffixSum(int[] arr){
        int n = arr.length;                                    //NEED TO WORK ON CODE
        for(int  i= 1; i<n; i++ ){                                 //LOGIC TO BE IMPLEMENTED
            arr[i] = arr[i] + arr[i+1];
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
