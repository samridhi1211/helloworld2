package OOPs;
class Employe{
    int id;
    int salary;

    String name;
    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println(" and my name is "+ name);
    }
    public int getsalary(){
        return salary;

}
}

public class AcessModifier {
    public static void main(String[] args) {
        System.out.println( "this is our custom class");
        Employe harry = new Employe();
        Employe john = new Employe();

        //setting attributes harry
        harry.id = 12;
        harry.name = "coding";
        harry.salary = 12345;

//  setting attributes john
        john.id = 13;
        john.salary = 456789;
        john.name = "joonas";

        //printing the attribute
        harry.printDetails();
        john.printDetails();
        int salary= harry.getsalary();
       // salary = harry.getsalary();
        System.out.println(salary);

    }
}
