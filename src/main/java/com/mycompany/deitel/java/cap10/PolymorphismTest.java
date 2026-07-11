/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap10;
import com.mycompany.deitel.java.cap9.BasePlusCommissionEmployeeComExtends;
import com.mycompany.deitel.java.cap9.CommissionEmployee;
//import com.mycompany.deitel.java.cap9.*;



/**
 *
 * @author victormendonca
 */
public class PolymorphismTest {
    public static void main(String[] args)
    {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        BasePlusCommissionEmployeeComExtends basePlusCommissionEmployee = 
                new BasePlusCommissionEmployeeComExtends("Bob", "Lewis", "333-33-3333", 5000, 0.4, 300);
        
        //invocando o método toString no objeto de superclasse usando a variável de superclasse.
        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", 
                "to superclass object", commissionEmployee.toString());
        
        //invocando toString no objeto da subclasse usando a variável de subclasse.
        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployeeUsingComposition's toString with subclass",
                "reference to subclass object", basePlusCommissionEmployee.toString());
        
        //invocando toString no objeto de subclasse usando a variável da superclasse
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        
        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployeeUsingComposition's toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());
    }
    
}
