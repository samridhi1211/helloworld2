package animal;
// interface is a 100%  abstract class
public interface IHerbivorous {
    public void eatGrass();
    default void eatFruit() {
        ;
    } // java 8  //in  single implementation
}
