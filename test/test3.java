package test;
// ข้อ 4 
import java.util.HashSet;
import java.util.Scanner;


public class test3  {
    public static void main(String[] args) {
         Scanner scanhash = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Integers " + (i + 1) + ": ");
            numbers[i] = scanhash.nextInt();
        }
        HashSet <Integer> uniqueNumbers = new HashSet <>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }
        System.out.print("Unique numbers is: ");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
        scanhash.close();
    }
}
