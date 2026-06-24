/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap4;

/**
 *
 * @author victormendonca
 */
public class CheckerboardPatternOfAsterisks {
    public static void main(String[] args) {
        for(int i = 1; i <= 8; i++)
        {
            if(i % 2 == 0)
                    System.out.print(" ");
            for(int j = 1; j <= 8; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
