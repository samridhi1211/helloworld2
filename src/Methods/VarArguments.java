package Methods;
import java.util.Arrays;
public class VarArguments {
    public static void main(String[] args) {
        multiple (2,3"kunal", "shiv", "reem");
    }
    static void multiple( int a , int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }

}
