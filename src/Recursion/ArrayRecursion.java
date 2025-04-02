package Recursion;

public class ArrayRecursion {

    static void printArray(int [] arr , int idx){
//        BASE CASE
        if(idx == arr.length){
            return;
        }

//        SELF WORK
        System.out.println(arr[idx]);

//        RECURSIVE WORK --> sub problem
        printArray(arr , idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8};
      printArray(arr,0);    //idx 0 se pass hogi bcoz we are iterating from 0index to last index
    }

}
