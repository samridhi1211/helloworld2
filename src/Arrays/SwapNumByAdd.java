package Arrays;

public class SwapNumByAdd {
    static void addswap(int a, int b){
        System.out.println("original value before swap");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        a= a + b;
        b= a - b;
        a= a - b;

        System.out.println("value after swap");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

    }

    public static void main(String[] args) {
        int a =4;
        int b= 5;
        int[] arr ={1,2,3,4,5};
        addswap(a,b);
    }
}
