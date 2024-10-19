package OOPs;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setname(String n) {
        name = n;

    }
}
class cellPhone {
    public void callingFrirend(){
        System.out.println("calling...");
    }
    public void ringing(){
        System.out.println("ring...");
    }
    public void vibrating(){
        System.out.println("vibrate...");
    }
}
class Square {
  int side;
    public int  Area() {
        return side * side;
    }
    public int Perimeter(){
        return 4*side;

    }
}
class Rectangle {
    int length;
    int breadth;
    public int Area(){
        return length*breadth;
    }
    public int Perimeter(){
        return 2*(length+breadth);
    }
}


public class ProblemSolving {
    public static void main(String[] args) {
        //problem 1
        Employee harry = new Employee();
        harry.setname("code with harry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
        System.out.println();
        //problem 2
        cellPhone asus = new cellPhone();
        asus.callingFrirend();
        asus.ringing();
        asus.vibrating();
        System.out.println();
        //problem 3
        Square shape = new Square();
        shape.side = 3;
        System.out.println(shape.Area());
        System.out.println(shape.Perimeter());
        System.out.println();
        //Problem 4
        Rectangle rc = new Rectangle();
        rc.length = 34;
        rc.breadth = 34;
        System.out.println(rc.Area());
        System.out.println(rc.Perimeter());
        System.out.println();
    }
}