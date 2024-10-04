package maths;

public class UsingMathsLibrary {
    public double sqrt(double number){
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        for(int i=0; i < 10; i++) {
            int number = (int) (Math.random() * 1000);
            System.out.println(number);
        }
    }
}
