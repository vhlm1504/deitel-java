/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9_inheritance;

/**
 *
 * @author victormendonca
 */
public class CommissionEmployeeTest {
    public static void main(String[] args)
    {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s%n %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social secutiry number", employee.getSocialSecurityNumber());
        System.out.printf("%s %s%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %s%n", "Commision rate is", employee.getCommissionRate());
        
        employee.setGrossSales(5000);
        employee.setCommissionRate(0.1);
        
        System.out.printf("%n%s:%n%n%s%n", "Update employee information obtained by toString", employee /*employee.toString()*/);
        
        
    }
    
}
