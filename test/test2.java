package test;
//ข้อ 5
import java.util.Scanner;

public class test2 {
    {
        Scanner scan = new Scanner(System.in);
        int n = 3;

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter Matrix A index of[" + i + "][" + j + "] : ");
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix A is");
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

        {
            Scanner scanv = new Scanner(System.in);
            int u = 3;

            int[][] zim = new int[u][u];

            for (int h = 0; h < u; h++) {
                for (int g = 0; g < u; g++) {
                    System.out.print("Enter Matrix B index of[" + h + "][" + g + "] : ");
                    zim[h][g] = scanv.nextInt();
                }
            }

            System.out.println("Matrix B is");
            for (int h = 0; h < u; h++) {
                for (int g = 0; g < u; g++) {
                    System.out.print(zim[h][g] + " ");
                }
                System.out.println();
            }
            int[][] tg = new int[n][n];
            for (int h = 0; h < h; h++) {
                for (int g = 0; g < n; g++) {
                    tg[h][g] = tg[g][h];

                }

            }

        }
        
}
}