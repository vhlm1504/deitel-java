/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap9;

/**
 *
 * @author victormendonca
 */
public class UndergraduateStudent extends Student{
    
    private String faculdade;
    private String curso;
    private int codCurso;
    private String dataInicioCurso;
    private String dataFimCurso;
    
    public UndergraduateStudent(String firstName, String lastName, String nascimento,
            String faculdade, String curso, int codCurso, String dataInicioCurso, String dataFimCurso)
    {
        super(firstName, lastName, nascimento);
        this.faculdade = faculdade;
        this.curso = curso;
        this.codCurso = codCurso;
        this.dataInicioCurso = dataInicioCurso;
        this.dataFimCurso = dataFimCurso;
    }
    
    
    
}
