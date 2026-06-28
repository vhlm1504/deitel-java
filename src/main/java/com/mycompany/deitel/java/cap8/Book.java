/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap8;

/**
 *
 * @author victormendonca
 */
public enum Book {
    
    JHTP("Java How to Program", "2015"),//declarando as constatnes deste tipo enum
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Baseic How to Program", "2014");
    
    private final String title;
    private final String copyrighYear;
    
    //enum constructor
    Book(String title, String copyrightYear)
    {
        this.title = title;
        this.copyrighYear = copyrightYear;
    }
    
    //accessor for field title
    public String getTitle()
    {
        return this.title;
    }
    
    //accessor for field copyrightYear
    public String getCopyrightYear()
    {
        return this.copyrighYear;
    }
}
