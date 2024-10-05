package Methods;
import java.util.Arrays;
public class FuncnOverloading {
    public static void main(String[] args) {

      int ans =  sum(2,4);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a+b;
    }
    static void fun(int a){
        System.out.println("first one" );
        System.out.println(a);
    }
}
