/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class GraduateStudent extends Student{
    
    private String curso;
    
    public GraduateStudent(String firstName, String lastName, String nascimento, String curso)
    {
        super(firstName, lastName, nascimento);
        this.curso = curso;
    }
    
    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    
    public String getCurso()
    {
        return curso;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s%s%n", super.toString(), getCurso());
    }
    
}
