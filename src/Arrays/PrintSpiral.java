package Arrays;

import java.util.Scanner;

public class PrintSpiral {

    static void printMatrix(int[][] matrix){
        for(int i=0; i< matrix.length ; i++){
            for(int j=0 ; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix, int r , int c){
        int topRow = 0 , bottomRow = r-1 , leftCol = 0 , rightCol = c-1;
        int totalElement = 0;

        while(totalElement < r * c){
            // toprow -> leftCol to rightCol
            for(int j= leftCol; j<= rightCol && totalElement < r * c; j++ ){
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;  //it avoids multiple print


            // rightCol -> topRow to bottomRow
            for(int i = topRow ; i<= bottomRow && totalElement < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;  // move left side


            // bottomRow -> rightCol to leftCol
            for (int j= rightCol ; j>= leftCol && totalElement < r * c ; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;  // move upper

            //leftCol -> bottomRow to topRow
            for(int i= bottomRow ; i>= topRow && totalElement < r * c ; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;

            }
            leftCol++; //moves right

            // DOING  ++ , -- helps to change boundary
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and coloumns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int total = r*c;
        System.out.println("enter" + total + "values");

        for(int i=0;i<r ; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        printSpiralOrder(matrix,r,c);
    }
}
