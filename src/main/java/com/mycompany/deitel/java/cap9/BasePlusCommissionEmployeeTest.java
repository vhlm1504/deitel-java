/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        var employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
        System.out.println("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %s%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());
        
        employee.setBaseSalary(1000);
        System.out.printf("%n%s:%n%n%s%n", "Update employee information obtained by toString", employee.toString());
        System.out.println("%n-----------------%n%n");
        BasePlusCommissionEmployeeComExtends novoEmployee = 
                                new BasePlusCommissionEmployeeComExtends("Bob", "Lewis", "333-33-3333", 5000.0, .04, 300.0);
        
        System.out.println("novoEmployee information obtained by get methods:");
        System.out.printf("%s %s%n", "First name is", novoEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", novoEmployee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", novoEmployee.getSocialSecurityNumber());
        System.out.printf("%s %s%n", "Gross sales is", novoEmployee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", novoEmployee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", novoEmployee.getBaseSalary());
        System.out.printf("%s %.2f%n", "earnings", novoEmployee.earnings());
        
        System.out.printf("%n%s%n", novoEmployee.toString());
        
        
    }
    
}
