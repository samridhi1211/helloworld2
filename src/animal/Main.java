package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
             public void walk() {

        }
        };
        // initialization ; Termination ; Steps
        for(int i = 1; i<= 10; i = i + 1) {
            System.out.print(i+" - ");
            animal.speak();
        }
        animal.listen("Come here");
    }
}

