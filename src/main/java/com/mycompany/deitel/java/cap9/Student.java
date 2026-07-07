/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class Student {
    
    private static int numeroMatricula = 0;
    private String registroAcademico;
    private final String RA = "RA";
    //private final int RE;
    
    private  String firstName;
    private  String lastName;
    private  String nascimento;
    
    
    public Student(String firstName, String lastName, String nascimento)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nascimento = nascimento;
        
        registroAcademico = String.format("%s%010d", RA, ++numeroMatricula);
        //RE = numeroMatricula;
    }
    
    /*public int getRE() {
        return RE;
    }
    */
    
    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
        
    public String toString()
    {
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %d%n", "Nome", getFirstName(), "Ultimo Nome", getLastName(), 
                "Data de Nascimento", getNascimento(), "Registro Academico", getRegistroAcademico(),"RE"/*, getRE()*/);
    }
    
    
    
}
