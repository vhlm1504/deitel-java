/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap10_polymorphism_and_interfaces;

/**
 *
 * @author victormendonca
 */
public class PayrollTest {
    
    public static void main(String[] args) {
        SalariedEmployee employee = new SalariedEmployee("Victor", "Mendonca", "007.126.541-43", 850.0);
        System.out.printf("%s%n%s: %.2f%n", employee.toString(), "earnings", employee.earnings());
        
        System.out.println();
        
        HourlyEmployee employee2 = new HourlyEmployee("Hugo", "Mendonca", "431.456.217-00", 150, 160.5);
        System.out.printf("%s%n%s: %.2f%n", employee2.toString(), "earnings", employee2.earnings());
        
        System.out.println();
        
        CommissionEmployee employee3 = new CommissionEmployee("Leite", "Mendonca", "123.456.789-00", 10000.50, .25);
        System.out.printf("%s%n%s: $%.2f%n", employee3.toString(), "earnings", employee3.earnings());
        
        System.out.println();
        
        BasePlusCommissionEmployee employee4 = new BasePlusCommissionEmployee("Edi", "Mendonca", "111-11-1111", 15000, .1, 2500);
        System.out.printf("%s%n%s: %.2f%n", employee4.toString(), "earnings", employee4.earnings());
        
    }
    
}
