package auladepi;

import java.util.Scanner;

public class AulaDePI {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("x1: ");
        double x1 = leitor.nextDouble();
        System.out.println("x2: ");
        double x2 = leitor.nextDouble();
        System.out.println("c: ");
        double c = leitor.nextDouble();
        
        
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(a * s);
        
        System.out.println(a + "x² " + b + " x + " + c + " = 0");
        
              
    }
    
}
