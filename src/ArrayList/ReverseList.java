package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList{
    static void reverseList(ArrayList<Integer> list) {
    int i=0 , j = list.size() -1;

    while(i < j){
        /*
        int temp = a;
        a = b;
        b = temp;
        */
        Integer temp = Integer.valueOf(list.get(i));
        list.set(i, list.get(j));
        list.set(j, temp);
        i++;
        j--;
    }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List" + list);
        Collections.reverse(list);
        System.out.println("Reversed List" + list);
        Collections.sort(list);
        System.out.println("Ascending Order" + list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Desc Order" + list);



        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("home");
        l1.add("Girl");
        System.out.println("OG" + l1);  //assigned order
        Collections.sort(l1 , Collections.reverseOrder());
        System.out.println("Sorted" + l1);    // alphabetical orders
    }
}
