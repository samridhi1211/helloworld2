package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        // initialization ; Termination ; Steps
        for(int i=1; i<= 10; i+=0) {
            System.out.print(i+" - ");
            animal.speak();
        }
        animal.listen("Come here");
    }
}
