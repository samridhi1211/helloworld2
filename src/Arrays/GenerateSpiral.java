package Arrays;

import java.util.Scanner;

public class GenerateSpiral {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
 // code not run during positive number .
    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;

        while (curr <= n * n) {
            // toprow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                matrix[topRow][j] = curr++;
            }
            topRow++;  //it avoids multiple print


            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr < n * n; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;  // move left side


            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr < n * n; j--) {
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;  // move upper

            //leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr < n * n; i--) {
                matrix[i][leftCol] = curr++;
            }
            leftCol++; //moves right
        }
        return matrix;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

      int[][]  matrix = generateSpiralMatrix(n);
      printMatrix(matrix);

    }
}
