/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap10_polymorphism_and_interfaces;

/**
 * Payroll system using polymorphism
 * abstract superclass Employee declara a interface da hierarquia, o conjunto de métodos que o programa pode invocar em 
 * todas os objetos Employee
 * @author victormendonca
 */
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public Employee()
    {
        this.firstName = null;
        this.lastName = null;
        this.socialSecurityNumber = null;
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
    
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    
    public abstract double earnings();
        
}
