/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class BasePlusCommissionEmployeeUsingComposition {
    
    private double baseSalary;
    private final CommissionEmployee employee;
    private int employeeNumber = 0;
    private static int countEmployee = 0;
    
    public BasePlusCommissionEmployeeUsingComposition(String firstName, String lastName, String socialSecurityNumber, 
           double grossSales, double commissionRate, double baseSalary)
    {
        this.employee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        if(baseSalary <= 0.0)
            throw new IllegalArgumentException("Base Salary must be > 0.0");
    
        this.baseSalary = baseSalary;
        employeeNumber = ++countEmployee;
    }
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary <= 0.0)
            throw new IllegalArgumentException("Base salary must be > 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    public void setCommissionRate(double commissionRate)
    {
        employee.setCommissionRate(commissionRate);
    }
    
    public void getGrossSales(double grossSales)
    {
        employee.setGrossSales(grossSales);
    }
    
    public double getCommissionRate()
    {
        return employee.getCommissionRate();
    }
    
    public double getGrossSales()
    {
        return employee.getGrossSales();
    }
        
    public double earnings()
    {
        return baseSalary + (employee.getCommissionRate() * employee.getGrossSales()); 
    }
    
    public String toString()
    {
        return String.format("%s%n%s %.2f%n%s %d%n%s: %.2f%n", employee.toString(), "base salary", getBaseSalary(), "employee number", getEmployeeNumber(), "Earnings", earnings());
    }
    
      public static String toString(BasePlusCommissionEmployeeUsingComposition empregado)
    {
        return String.format("%s%n", empregado.toString());
    }

}
