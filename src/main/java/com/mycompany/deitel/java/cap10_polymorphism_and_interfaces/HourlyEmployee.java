/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap10_polymorphism_and_interfaces;

/**
 *
 * @author victormendonca
 */
public class HourlyEmployee extends Employee{
    
    private double wage;//quanto ganha por hora
    private double hours;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours)
    {
        super(firstName, lastName, socialSecurityNumber);// se não especificar qual construtor ou se na superclasse não houver, chama implicitamente o construtor padrão da superclasse imeditata
                
        setWage(wage);
        setHours(hours);
    }
    
    public void setWage(double wage)
    {
        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        this.wage = wage;
    }
    
    public double getWage()
    {
        return wage;
    }
    
    public void setHours(double hours)
    {
        if(hours < 0.0 || hours > 168.0)
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        
        this.hours = hours;
    }
    
    public double getHours()
    {
        return hours;
    }
    
    @Override
    public double earnings()
    {
        if(getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        /*
        return 0.0; //ou
        //throw new UnsupportedOperationException();//caso deseje que o compilador aceite a execução mas que pare caso em alguma linha se tente chamar a função inacabada.
        */
    }
    
    @Override
    public String toString()
    {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
    
}
