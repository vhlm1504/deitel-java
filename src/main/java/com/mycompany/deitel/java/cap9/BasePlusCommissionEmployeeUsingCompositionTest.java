/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class BasePlusCommissionEmployeeUsingCompositionTest {
    public static void main(String[] args) {
        
        var employee = new BasePlusCommissionEmployeeUsingComposition("Saul", "Goodman", "111-11-1111", 10000, 0.1, 3500.0);
        var newEmployee = new BasePlusCommissionEmployeeUsingComposition("Rick", "Sanchez", "222-22-2222", 9500, 0.1, 3500.0);
        var employeeNumberThree = new BasePlusCommissionEmployeeUsingComposition("Number", "Three", "333-33-3333", 11000, 0.1, 4500.0);
        
        System.out.printf("%s:%n%s%n", "Como inicializado pelo construtor", employee.toString());
        System.out.println();
        System.out.printf("%s:%n%s%n", "Usando toString static", BasePlusCommissionEmployeeUsingComposition.toString(employee));
        System.out.println();
        System.out.printf("%s:%n%s%n", "Como inicializado pelo construtor", newEmployee.toString());
        System.out.println();
        //System.out.printf("%s:%n%s%n", "Usando toString static", BasePlusCommissionEmployeeUsingComposition.toString(newEmployee));
        //System.out.println();
        System.out.printf("%s:%n%s%n", "Como inicializado pelo construtor", employeeNumberThree.toString());
        System.out.println();
        //System.out.printf("%s:%n%s%n", "Usando toString static", BasePlusCommissionEmployeeUsingComposition.toString(employeeNumberThree));
        
        employeeNumberThree.setBaseSalary(employeeNumberThree.getBaseSalary() * 1.15);
        employeeNumberThree.setCommissionRate(employeeNumberThree.getCommissionRate() * 1.1);
        System.out.printf("%s:%n%s%n", "Aumento de salario", employeeNumberThree.toString());
        System.out.println();
        System.out.printf("%s:%n%s%n%s%n", "Comparando funcionarios", employeeNumberThree.toString(), employee.toString());
        
        
    }
    
}
