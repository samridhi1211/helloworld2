package animal;

// Inheritance
// cat is a Animal
public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
