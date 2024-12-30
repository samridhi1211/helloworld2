package Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Wrapper Class
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(5f);
//        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>() ;

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println(l1.get(1));

        //print with for loop
        for(int i= 0 ; i < l1.size() ; i++) {
            System.out.println(l1.get(i));
        }

        // Print the Array list Directly
        System.out.println(l1);    // [5,6,7,8]

        //adding element at some index i
        l1.add(1,100);
        System.out.println(l1); // [5,100, 7, 8]

        //modify  element at index i
        l1.set(1,10);
        System.out.println(l1); //[5,10,7,8]

        //removing an element at index i
        l1.remove(2);
        System.out.println(l1);     // 5 10 8

        //removing an element
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);   //5 6 8

        //checking if an element exist
        boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);

        //IF YOU DON'T SPECIFY THE CLASS
        ArrayList l = new ArrayList();   // we can give any data type as  if not mentioned there
        l.add("p");




    }
}
