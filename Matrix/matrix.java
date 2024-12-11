package Matrix;
import java.util.Scanner;

public class matrix {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    
        int n = 3;
        
   
        int[][] matrix = new int[n][n];

     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matrix[" + i + "][" + j + "] : ");
                matrix[i][j] = scan.nextInt();
            }
        }

       
        System.out.println("Matrix Column");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        int[][] transposeMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

       
        System.out.println("Matrix Row");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}

