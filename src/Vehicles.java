 class Vehicles {
    String brand = "Ford";
    public void honk() {
        System.out.println("tuut,tuut!");
    }
}
class Car extends Vehicles {
     String modlname= "Mustang";

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modlname );

    }

}