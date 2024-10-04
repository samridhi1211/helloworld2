package data.ll;

public class DemoLL {

    public static void main(String[] args) {



        LLNode a = new LLNode();
        a.value = 21;
        LLNode b = new LLNode();
        b.value = 41;
        a.next = b;

        LLNode c = new LLNode();
        b.next = c;
        c.value = 45;

    }
}
