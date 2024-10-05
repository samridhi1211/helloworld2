package Methods;

public class Scping {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        String name = "rahul";
        {
             a = 23;
            System.out.println(a);
             int c = 44;
             name = "tree";
            System.out.println(name);
             // values initialised in this block , willl remain in block
        }
        System.out.println(a);
        System.out.println(name);

    }
    static void random(int marks) {
        int num = 34;
        System.out.println(num);
    }
}
