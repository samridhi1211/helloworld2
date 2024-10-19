package animal;

public class Dog extends Animal implements IHerbivorous, ICarnivorous{
    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public void walk() {

    }

    @Override
    public void eatMeat() {

    }

    @Override
    public void eatGrass() {

    }
}
