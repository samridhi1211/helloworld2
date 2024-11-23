package Arrays;

import java.util.Scanner;

public class SwapRotateArray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void reverse(int[] arr ,int i , int j){

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }


static void  RotateArray(int[] arr, int k){
    int n = arr.length;
     k= k % n;
    reverse(arr, 0, n-k-1);
    reverse(arr, n-k, n-1);
    reverse(arr, 0, n-1);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size:");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.print("enter " + n + "element");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.print("ente k : ");
    int k = sc.nextInt();

    System.out.println("original array");
    printArray(arr);
    RotateArray(arr, k);
//    int[] ans = rotate(arr, k);
    System.out.println("Array after rotation");
    printArray(arr);

}
}
