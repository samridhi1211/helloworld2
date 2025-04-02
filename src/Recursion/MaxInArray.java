package Recursion;

public class MaxInArray {

    static int maxInArray(int [] arr , int idx){
//        BASE CASE
        if(idx == arr.length-1){
            return arr[idx];
        }

//        SMALL PROBLEM --> idx+1 , end of the array  --> max --> RECURSIVE
        int smallAns = maxInArray(arr , idx+1);

//        SELF WORK and FINAL ANS
        return Math.max(arr[idx] , smallAns);
    }
    public static void main(String[] args) {
        int [] arr = {3,5,4,787};
        System.out.println(maxInArray(arr , 0));
    }
}
