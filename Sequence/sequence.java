package Sequence;
import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int o = scanner.nextInt();


        int sum1 = 0;
        int a = 10;  
        while (a >= 1) {
            System.out.print(a + " ");
            sum1 += a;
            a--; 
        }
        System.out.println(sum1);

    
        int sum2 = 0;
        int b = 1;  
        while (b <= 19) {
            System.out.print(b + " ");
            sum2 += b;
            b += 2;  
        }
        System.out.println(sum2);



   int sum3 = 0;
   int c = 1; 
   while (c <= 19) {
    
       if ((c / 2) % 2 == 0) {  
           System.out.print(-c + " ");
           sum3 += c;  
       } else {
           System.out.print(c + " ");
           sum3 -= c;  
       }
       c += 2; 
   }
   System.out.println(sum3);
   scanner.close();
    }
}