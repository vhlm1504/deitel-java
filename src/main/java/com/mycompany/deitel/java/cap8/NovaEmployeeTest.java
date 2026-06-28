/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap8;

/**
 *
 * @author victormendonca
 */
public class NovaEmployeeTest {
    
    public static void main(String[] args)
    {
        System.out.printf("Employees before instantiation: %d%n", NovaEmployee.getCount());
        
        NovaEmployee e1 = new NovaEmployee("Susan", "Baker");
        NovaEmployee e2 = new NovaEmployee("Bob", "Blue");
        
        System.out.printf("%nEmployees after instantiation: %n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());//então um método static também pode ser acessado pelo objeto?
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", NovaEmployee.getCount());
        
        
        
        
    }
    
}
