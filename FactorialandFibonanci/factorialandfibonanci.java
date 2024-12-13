package FactorialandFibonanci;

import java.util.Scanner;

public class factorialandfibonanci {
    Scanner scanIn = new Scanner(System.in);
    static int fact = 1, fibonanci = 0;
    static int a;
    public static int Factorial(int a){
    for (int i = 1; i <= a; i++) {
    System.out.println(i + "! =" + fact);
    fact += fact * i;
    }
    fact = fact/(a+1);
    return(fact);
    }
    public static int Fibonanci(int a){
    int f0 = 0, f1=1;
    if(a>=0){
    System.out.println("f0 = " + f0);
    }if(a >=1){
    System.out.println("f1 = " + f1);
    }for(int i =2; i<= a; i++){
    fibonanci= f0 + f1;
    System.out.println("f" + i+ " = "+fibonanci);
    f0 = f1;
    f1 = fibonanci;
    }
    return(fibonanci);
    }
    public static void main(String[] args) {
        
        Scanner scanIn = new Scanner(System.in);
        
        
        System.out.print(" ");
        int a = scanIn.nextInt();  
        
        int fact = Factorial(a);  
        int fibo = Fibonanci(a);   
        

        System.out.println("Factorial-Fibonanci = " + (fact - fibo));
        
        scanIn.close();  
    }
    }
    
