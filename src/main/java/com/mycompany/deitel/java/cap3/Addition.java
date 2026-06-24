/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap3;

import java.util.Scanner;
/**
 *
 * @author victormendonca
 */
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, sum;
        
        System.out.println("Enter the first integer: ");
        num1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        num2 = input.nextInt();
        
        sum = num1 + num2;
        
        System.out.printf("Sum is %d%n", sum);
    }
    
}
