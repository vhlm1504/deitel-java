/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap8;

/**
 *
 * @author victormendonca
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;//composição referêcia a um objeto Date
    
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
    
    public String toString()
    {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);//aqui o método toString de Date é chamada implicitamente porque são referências das classe
                                                            //poderia ter sido escrito assim: lastName.toString()
                                                             
    }
    
}
