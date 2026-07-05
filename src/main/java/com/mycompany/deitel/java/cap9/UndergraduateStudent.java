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

    public String getFaculdade() {
        return faculdade;
    }

    public String getCurso() {
        return curso;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public String getDataInicioCurso() {
        return dataInicioCurso;
    }

    public String getDataFimCurso() {
        return dataFimCurso;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s%s: %s%n%s: %d - %s%n%s: %s - %s%n", super.toString(), "Faculdade", getFaculdade(), "Curso", getCodCurso(), 
                getCurso(), "Periodo do curso", getDataInicioCurso(), getDataFimCurso());
    }
    
    
    
}
