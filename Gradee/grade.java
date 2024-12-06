package Gradee;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("ใส่คะแนน");
        int score = scanner.nextInt();
        

        if (score < 0 || score > 100) {
            System.out.println("ให้ใส่คะแนนระหว่าง0-100");
        } else if (score >= 80) {
            System.out.println("เกรด A");
        } else if (score >= 70) {
            System.out.println("เกรด B");
        } else if (score >= 60) {
            System.out.println("เกรด C");
        } else if (score >= 50) {
            System.out.println("เกรด D");
        } else {
            System.out.println("เกรด F");
        }

        scanner.close();
    }
}
