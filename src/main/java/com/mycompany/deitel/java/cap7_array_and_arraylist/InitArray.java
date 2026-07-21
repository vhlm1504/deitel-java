/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap7_array_and_arraylist;

/**
 *
 * @author victormendonca
 */
public class InitArray {
    public static void main(String[] args)
    {
        if(args.length != 3)
            System.out.printf("Error: Please re-enter the entire command, including%n" + 
                    "an array size, initial value and increment.%n");
        else
        {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
        }
        
        System.out.println(args[0] + " " + " " + args[1] + " " + args[2]);
    }
    
}
