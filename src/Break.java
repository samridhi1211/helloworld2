public class Break {
    public static void main(String[] args) {
        int a = 7;

        while(a < 12){
            if(a== 11){
                break;
            }
            System.out.print("value of x is :"+ a);
            a++;
            System.out.println();
        }
    }
}
