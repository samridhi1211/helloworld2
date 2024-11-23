package Arrays;

public class SwapTwoNumber {
    static void swap(int a , int b){
        System.out.println("original value before swap");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        int temp = a;  //temp=9
        a= b;// a= 4
        b= temp; //b=9

        System.out.println("value after swap");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

    }

    public static void main(String[] args) {
        int a= 9;
        int b = 4;
        int[] arr = {1,2,3,4,5};
        swap(a,b);
    }
}
