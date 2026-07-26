/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap11_exception_handling;

/**
 *
 * @author victormendonca
 */
public class UsingExceptions {
    public static void main(String[] args)
    {
        try{
            throwException();
        }
        catch(Exception exception)
        {
            System.err.println("Exception handled in main");
        }
        
        doesNotThrowException();
    }
    
    //demonstra try...catch...finally
    public static void throwException() throws Exception
    {
        try{
            System.out.println("Method theowException");
            throw new Exception();//generete exception
        }
        catch (Exception exception)
        {
            System.err.println("Exception handled in method throwException");
            throw exception;
        }
        
        finally 
        {
            System.err.println("Finally executed in throwException");
        }
    }
    
    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("Method doesNotThrowException");
        }
        catch (Exception exception)
        {
            System.err.println(exception);
        }
        finally
        {
            System.err.println("Finally executed in doesNotThrowException");
        }
        
        System.out.println("End of method doesNotThrowException");
    }
    
       
}
