/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap10;

/**
 *
 * @author victormendonca
 */
public class SalariedEmployee1 extends Employee1 {
    
    private double weeklySalary;
    
    public SalariedEmployee1(String firstName, String lastName, String socialSecurityName, double weeklySalary)
    {
        super(firstName, lastName, socialSecurityName);
        
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }
    
    public void setWeeklySalary(double weeklySalary)
    {
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }
    
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    /*
    @Override
    public double earnings()
    {
        return getWeeklySalary();        
    }
    */
    
    @Override
    public double getPaymentAmount()
    {
        return getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
    
}
