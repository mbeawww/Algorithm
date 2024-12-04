package Salary;

import java.util.Scanner;

class salary {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Input your salary:");
        float salary = scanIn.nextFloat();
        scanIn.close();
        float w = 0;
        if (salary <= 15000) {
            w += salary * 0.05;
        }else {
            w += 15000 * 0.05;
        }
    System.out.println("Your Welfare is: " + w + "Baht");
    
    
    }
}