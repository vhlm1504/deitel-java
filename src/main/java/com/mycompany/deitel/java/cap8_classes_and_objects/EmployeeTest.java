/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap8_classes_and_objects;

/**
 *
 * @author victormendonca
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        
        System.out.println(employee); //método toString de Employee é chamado implicitamente aqui. employee.toString() outra forma de escrever
    }
    
}
