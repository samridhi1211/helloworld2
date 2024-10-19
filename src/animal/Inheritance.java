package animal;

class Base {
int x;

public int getx() { // public means you can access everything
    return x;
}

public void setx(int x) {
    System.out.println("i am  the  setting x now");  // Base contain only x.
    this.x = x;
}
public void printMe(){
    System.out.println("i am a constructor");
}
}
class Derived extends Base{
    int y;
    public int gety() {
        return y;      // Derived contain x but also y element
    }

     

public void sety(int y) {
    this.y = y;
}
}

public class Inheritance {
    public static void main(String[] args) {
        //creating an object of base class
        Base b = new Base();   //Base objects
        b.setx(4);
        System.out.println(b.getx());

        //creating an object of derived class
        Derived d = new Derived();
         d.setx(43);
        System.out.println(d.getx());


    }
}
