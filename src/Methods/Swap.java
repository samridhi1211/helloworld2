package Methods;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+ " "+ b);

     String name = "khushi";
        changename(name);
        System.out.println(name);

    }
    static void changename(String naam) {
      naam= "rana";    //creating a new object

    }
    static void swap(int a , int b){
        int temp =a;
        a=b;
        b= temp;
    }
}
