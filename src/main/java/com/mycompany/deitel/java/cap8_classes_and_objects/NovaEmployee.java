/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap8_classes_and_objects;

/**
 *
 * @author victormendonca
 */
public class NovaEmployee {
    
    private static int count = 0;//número de empregados criado no momento
    private String firstName;
    private String lastName;
    
    public NovaEmployee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count;
        System.out.printf("Employee constructor: %s %s; coutn = %d%n", firstName, lastName, count);   
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public static int getCount()
    {
        return count;
    }
}
