package DateMonthYear;

import java.util.Scanner;

public class datemonthyear {
    public static void checkinput(int date,int month,int year) {
    if (year > 2600) {
    System.out.println("Wrong");
    return;
    }
    if (month < 1 && month > 12 ) {
        System.out.println("Wrong");
        return;
    }
    }

    public static void main(String [] args) {
    Scanner scanIn = new Scanner(System.in);
    int d = scanIn.nextInt();{
    if(d >= 1 && d <= 31) {
        int maxdays = 28;
        int month = 12;
        if (month == 2) {
        System.out.println("February");
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        int maxDays = 30;
        System.out.println("เดือนที่ลงท้ายด้วยวันที่ 30");
    }
        } else {
                System.out.println("date 31");
            }
    
        
        
        }       
    System.out.println("Date");
    int m = scanIn.nextInt();
    if(m >= 1 && m <= 12) {
    System.out.println("Correct");
    } else {
    System.out.println("Wrong");
    }
    System.out.println("Month");
    int y = scanIn.nextInt();
    if(y >= 1 && y <= 2565) {
        System.out.println("Correct");
        } else {
        System.out.println("Wrong");
        System.out.println("Year");
     }
    }
}

    

