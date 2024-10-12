package data.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(23);
//        list.add(238);
//        list.add(263);
//        list.add(345);
//        list.add(237);
//        list.add(84243);
//        list.add(235);
//        list.add(523);
//        list.add(253);
//        list.add(238);
//        list.add(823);
//        list.add(273);
//        list.add(2388);
//        list.add(723);
//        list.add(234);
//        list.add(253);
//        list.add(2364);
//        list.add(283);
//        list.add(2143);

//        System.out.println(list.contains(84243)
//

        //input
        for (int i = 0; i < 5; i++) {
        list.add(sc.nextInt());

    }
        // get items at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here ,list[index] syntax will not working

        }
       // System.out.println(list);

    }
}
