package data.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted {
    static int[] smallestandlargestelement(int[]arr){
        Arrays.sort(arr);
       int[] ans = {arr[0],arr[arr.length-1]};
       return ans;
    }


  static boolean sorted(int [] arr){
      boolean check = true;
      for (int i =1; i<arr.length;i++) {
          if(arr[i] <arr[i-1]){
              check = false;
              break;

          }
      }
      return check;
  }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of elements");
            int n = sc.nextInt();
            int [] arr = new int[n];

            System.out.println("enter " + n + " elements");
            for(int i = 0; i< arr.length; i++){
                arr[i]= sc.nextInt();

            }
//            System.out.println("sorted : "+ sorted(arr));
            int [] ans = smallestandlargestelement(arr);
            System.out.println("smallest : "+ ans[0]);
            System.out.println("largest : "+ ans[1]);
    }
}
