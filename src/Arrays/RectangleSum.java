package Arrays;

import java.util.Scanner;

public class RectangleSum {
    static int findSum(int[][] matrix, int l1, int r1 , int l2 , int r2) {
        int sum = 0;

        for(int i =l1; i<=l2; i++){
            for(int j= r1; j<=r2; j++){
                sum += matrix[i][j];

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and coloumn");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("enter" + totalElements + " values");
        for(int i= 0; i<r; i++){
            for(int j=0; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangular Boundaries l1, r1 , l2 ,r2");
        int l1 = sc.nextInt();
        int  r1 = sc.nextInt();
        int l2= sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("rectangle Sum" + findSum(matrix, l1 , r1 ,l2, r2));

    }
}
