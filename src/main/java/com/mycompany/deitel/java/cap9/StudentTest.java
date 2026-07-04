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
    }
    
}
