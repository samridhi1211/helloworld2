package animal;

public class Animal {
    private byte eyes = 2;
    private byte nose =1;
    private byte ears = 2;

    // Primitive data type
    // https://www.tutorialspoint.com/java/java_basic_datatypes.htm
    // Integer
    // 1. byte 128 --- + 127
    // 2. short 32K
    // 3. int 2 Billion
    // 4. long

    // Decimal
    // 1.  float
    // 2. double

    private float price = 890.50f;
    private double rate = 890.50d; // high precison

    // Character
    // 1. char
    private char character = 'w';

    // boolean
    private boolean domestic = true;
    // All the variables in a class define the state of the class
    // The state is stored in database when we do persistence
// behaviour = methods
    public void speak(){
        System.out.println("Start  speaking ");
    }

    public void listen(String words){
        System.out.println("I am using Ears number = "+ears);
        System.out.println("I am listening "+words);
    }
    // Encapsulation = Data hiding


    public byte getEyes() {
        return eyes;
    }

    public void setEyes(byte eyes) {
        this.eyes = eyes;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    // Identity
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
