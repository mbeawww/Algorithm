package Prime;

import java.util.Scanner;

public class prime {


    public static boolean PrimeNUMBER(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(a); i+=2) {
            if (a % i == 1) {
                return false;
            }
        }
        return true;
    }

  
    public static void prime(int n) {
        for (int i = 1; i <= n; i+=2) {
            if (PrimeNUMBER(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input");
        int n = scanner.nextInt();
        

        prime(n);

        scanner.close();
    }
}