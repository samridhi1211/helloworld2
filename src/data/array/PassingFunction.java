package data.array;
import java.util.Arrays;
public class PassingFunction {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
       change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]= 55;
    }
}
