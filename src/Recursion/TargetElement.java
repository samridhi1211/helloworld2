package Recursion;

public class TargetElement {

//   find the first target element --> return index of target if target present in array , otherwise
    static int findIndex(int [] a, int n , int target , int idx){
        if(idx >= n)  return -1;

        if(a[idx] ==target) return idx;

        return findIndex(a , n , target , idx+1);
    }

    static boolean search(int [] a , int n , int target , int idx ){    //where n is elementary its represent array length

//       BASE CASE
        if(idx >= n){
         return false;
     }
//        SELF WORK
     if(a[idx] == target)return true;
//       RECURSIVE WORK
     if(search(a , n, target , idx+1)){
         return true;
     }else{
         return false;
     }


    }

    public static void main(String[] args) {
        int[] a = {1,2 ,5,5,4,6};
        int target = 5;
        int n = a.length;

        System.out.println(findIndex(a, n , target, 0));

        if(search(a, n, target, 0)){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }

    }
}
