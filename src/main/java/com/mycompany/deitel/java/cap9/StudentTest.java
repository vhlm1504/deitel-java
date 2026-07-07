/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class StudentTest {
    
    public static void main(String[] args)
    {
        Student student = new Student("Rick", "Sanches", "01/01/1950");
        System.out.printf("%s", student.toString());
        
        Student newStudent = new Student("Harry", "Dunne", "01/01/1960");
        System.out.printf("%s", newStudent.toString());
        
        UndergraduateStudent rambo = new UndergraduateStudent("Rambo", "Ranger", "01/01/1945", "Ciencias Humanas", "Educacao Fisica", 24, "01/01/2026", "01/06/2028");
        System.out.printf("%s", rambo.toString());
        
        GraduateStudent homer = new GraduateStudent("Homer", "Simpson", "01/01/1950", "Mestrado em Energia Nuclear");
        System.out.printf("%s", homer.toString());
        
        System.out.printf("%s", student.toString());
    }
    
}
