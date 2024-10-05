package Methods;

import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        // change an array
        int []arr = {1,2,43,4,55};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] nums){
        nums[0]= 99;   //if you make a change to  the object via thid ref variable , same oobject will be change
    }
}
