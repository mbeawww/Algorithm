package Maxplusmin;
import java.util.Scanner;

public class maxplusmin {
        public static int max(int a, int b, int c) {
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            return max;
        }
    
        public static int min(int a, int b, int c) {
            int min = a;
            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }
            return min;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("");
            int z = scanner.nextInt();
            System.out.print("");
            int x = scanner.nextInt();
            System.out.print("");
            int c = scanner.nextInt();
    
            int Max = max(z, x, c);
            int Min = min(z, x, c);
    
            System.out.println(Max);
            System.out.println(Min);
            System.out.println(Max + Min);
        }
}

