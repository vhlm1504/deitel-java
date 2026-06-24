/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap4;

/**
 *
 * @author victormendonca
 */
public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Jane Green", 93.5);
        Student account2 = new Student("John Blue", 72.76);
        
        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());
    }
    
}
