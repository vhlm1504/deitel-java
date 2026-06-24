/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap3;

/**
 *
 * @author victormendonca
 */
public class InvoiceTest {
    
    public static void main(String[] args)
    {
        Invoice compra = new Invoice("123", "Chave de fenda", 2, 15.99);
        
        System.out.printf("Compra: %dx %s = %f%n", compra.getQuantity(), 
                compra.getPartDescription(), compra.getInvoiceAmount());
        
    }
    
}
