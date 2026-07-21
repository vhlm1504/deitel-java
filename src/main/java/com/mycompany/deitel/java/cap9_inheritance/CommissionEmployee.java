/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9_inheritance;

/**
 *
 * @author victormendonca
 */
public class CommissionEmployee extends Object{
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
            double grossSales, double commissionRate)
    {
        //uma chamada implícita ao construtor default de Object ocorre aqui
        
        //se grossSales é inválida, lance uma exceção 
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        //se commissionRate é inválida, lance exceção
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    public void setGrossSales(double grossSales)
    {
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }
    
    public void setCommissionRate(double commissionRate)
    {
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Gross sales must be > 0.0 and < 1.0");
        }
        
        this.commissionRate = commissionRate;
    }
    
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();        
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", 
                getFirstName(), getLastName(), "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
    
}
