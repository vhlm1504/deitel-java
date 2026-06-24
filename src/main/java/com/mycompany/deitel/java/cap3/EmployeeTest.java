/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap3;

/**
 *
 * @author victormendonca
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee empregado1 = new Employee("victor", "Mendonça" , 150000);
        Employee empregado2 = new Employee("cissa", "Mendonça", 300000);
        
        System.out.printf("Empregado %s, salário %f%n", empregado1.getFirstName(), empregado1.getMonthlySalary());
        
        System.out.printf("Empregado %s, salário %f%n", empregado2.getFirstName(), empregado2.getMonthlySalary());
        
        double aumento = empregado1.getMonthlySalary() * 1.1;
        empregado1.setMonthlySalary(aumento);
        aumento = empregado2.getMonthlySalary() * 1.1;
        empregado2.setMonthlySalary(aumento);
        
        
        System.out.printf("Empregado %s, salário %f%n", empregado1.getFirstName(), empregado1.getMonthlySalary());
        
        System.out.printf("Empregado %s, salário %f%n", empregado2.getFirstName(), empregado2.getMonthlySalary());
        
    }
    
}
