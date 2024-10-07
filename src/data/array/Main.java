package data.array;

import data.ll.LLNode;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5};
        LLNode  head = new LLNode();
        LLNode current = head;
        for(int i = 0; i < numbers.length;  i++){
            System.out.println(i+" - "+numbers[i]);
            current.value = numbers[i];
            current.next = new LLNode();
            if(i==numbers.length-1){
                current.next = null;
            }
            current = current.next;


        }
    }
}
