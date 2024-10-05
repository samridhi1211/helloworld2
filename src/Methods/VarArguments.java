package Methods;
import java.util.Arrays;
public class VarArguments {
    public static void main(String[] args) {
//        multiple (2,3, "shiv", "reem");
        demo("de","we","to");

    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
//    static void multiple( int a , int b, String ...v) {
//        System.out.println(Arrays.toString(v));
    }


