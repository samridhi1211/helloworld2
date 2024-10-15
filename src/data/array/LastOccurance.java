package data.array;

import java.util.Scanner;

public class LastOccurance {
    static int lastOccurance(int [] arr, int x){
        int lastIndex = 0;
        for(int i= 0; i< arr.length ; i++) {
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("enter " + n + " elements");
        for(int i = 0; i< arr.length; i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("enter x ");
        int x = sc.nextInt();
        System.out.println("LASTOCCURANCE : " + lastOccurance(arr , x));
    };

}
