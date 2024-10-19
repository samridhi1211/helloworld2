package Fruits;

abstract  class Fruits {
    private String characteristics= "seeds" ;

   public abstract void flowerColour();
    public  void flavour() {
        System.out.println("sweet in taste");
    }

    public void texture() {
        System.out.println("different shapes");
    }

    public void fragrantfruits(){
        System.out.println("smells like a fruity scents");
    }
}
