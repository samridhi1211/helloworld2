package animal;

public class Cow extends Animal implements IHerbivorous{
    @Override
    public void walk() {

    }

    @Override
    public void eatGrass() {

    }
    public void eatFruit(){
        System.out.println("Eating fruit");
    }
}
