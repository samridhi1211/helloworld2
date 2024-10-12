package data.array;



class ArrayExample {
    void searchofelement() {
        int[] arr = {1, 2, 3, 45, 5, 6};
        int x = 2;

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println(" found " + x + " at index " +  ans);

    }


    public  static class ArraysExample {
        public static void main(String[] args) {
            ArrayExample obj = new ArrayExample();
            obj.searchofelement();
        }
    }
}