package Factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;
             for (int i = 1; i <= n; i++) {
                factorial *= i; 
            }       
            System.out.println(factorial);
            scanner.close();
        }
    }