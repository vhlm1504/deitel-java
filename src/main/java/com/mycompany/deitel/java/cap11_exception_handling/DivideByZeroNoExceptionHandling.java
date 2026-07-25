/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap11_exception_handling;
import java.util.Scanner;
/**
 *
 * @author victormendonca
 */
public class DivideByZeroNoExceptionHandling {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer numerator: ");
        int numerator = input.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = input.nextInt();
        int result = quotient(numerator, denominator);
        System.out.printf("%nResult: %d/%d = %d%n", numerator, denominator, result);
    }
    
    public static int quotient(int numerator, int denominator)
    {
        return numerator/denominator;
    }
    
}
