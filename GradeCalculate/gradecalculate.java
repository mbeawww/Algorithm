package GradeCalculate;

import java.util.Random;

public class gradecalculate {

    public static void main(String[] args) {
        int[] scores = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i < scores.length; i++) {
     
            scores[i] = rand.nextInt(60) + 40;
            System.out.println("Score of student " + (i + 1) + " is " + scores[i]);
        }

        System.out.println("\nCalculation Grade");

        for (int i = 0; i < scores.length; i++) {
            char grade = calculateGrade(scores[i]);
            System.out.println("Grade of student " + (i + 1) + " is " + grade);
        }
    }
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'a';
        } else if (score >= 75) {
            return 'B';
        } else if (score >= 70) {
            return 'b';
        } else if (score >= 65) {
            return 'C';
        } else if (score >= 60) {
            return 'c';
        } else if (score >= 55) {
            return 'D';
        } else if (score >= 50) {
            return 'd';
        } else {
            return 'F';
        }
    }
}