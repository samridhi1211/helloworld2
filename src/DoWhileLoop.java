public class DoWhileLoop {
    public static void main(String[] args) {
        int x = 10;
        do{
            x++;
            if(x==15){
                continue;
            }
            System.out.print("value of x:"+ x);
            System.out.println();
        }while(x <20);
    }
}
