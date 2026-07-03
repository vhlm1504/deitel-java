/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class BasePlusCommissionEmployeeComExtends extends CommissionEmployee{
    
    private double baseSalary;
    
    public BasePlusCommissionEmployeeComExtends(String firstName, String lastName, 
            String socialSecurityNumber, double grossSales,double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }
    
    @Override
    public String toString()
    {
        
        return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
        /*return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
                "base-salaried commission employee", super.getFirstName(), super.getLastName(),
                "social security number", super.getSocialSecurityNumber(),
                "gross sales", super.getGrossSales(), "commission rate", super.getCommissionRate(),
                "base salary", baseSalary);
        */
    }   
}
