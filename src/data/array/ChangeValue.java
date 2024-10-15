package data.array;



public class ChangeValue {
    static void printArray(int[]arr){
        for(int i= 0 ;i<arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int []arr){
        for(int i = 0 ;i<arr.length ; i++){
//            System.out.println(arr[i] + "  ");
            arr[i]= 0;
        }
    }
    static void changeVal(int a) {
        a= 123;
    }
    public static void main(String[] args) {
        int a = 3;
        changeVal(a);
        System.out.println(a);  //a actual pass nhi hua , a ki copy bni jisme ki value pass hui h

        int [] arr= new int[4];
        arr[0] = 23;
        arr[1]= 25;
        arr[2]= 345;
        arr[3]=45;

        changeArray(arr);
        printArray(arr);
    }
}
