package Methods;

public class Shadowing {
    static int x = 67;

    public static void main(String[] args) {
        System.out.println(x);
        int x;

        x  = 48;
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
