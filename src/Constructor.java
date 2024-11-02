

    class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(String myname ,int myid){
    id =myid;
    name = myname;
    }
        public MyMainEmployee(){
            id = 2;
            name = name;
        }



        public String getName() {return name; }
        public void setName (String n ){this.name = n;}
        public void setId(int i){ this.id = i;}
        public int getId() { return id; }
         
    }
    public class Constructor {
        public static void main(String[] args) {
//            MyMainEmployee harry = new MyMainEmployee("programming", 456789);
          MyMainEmployee harry = new MyMainEmployee();
//            harry.setName("code with harry");
//            harry.setId(34);
            System.out.println(harry.getId());
            System.out.println(harry.getName());
        }
    }

