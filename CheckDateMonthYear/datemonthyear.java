package CheckDateMonthYear;

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
        int days = 28;
        int month = 12;
        if (month == 2) {
        System.out.println("28 day in month");
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        int Days = 30;
        System.out.println("30 day in month");
    }
        } else {
                System.out.println("31 day in month");
            }
    
      
        }       
    System.out.println("Date");
    if(d >= 1 && d <= 30) {
        System.out.println("Correct");
        } else {
        System.out.println("Wrong");
        } 
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

    

