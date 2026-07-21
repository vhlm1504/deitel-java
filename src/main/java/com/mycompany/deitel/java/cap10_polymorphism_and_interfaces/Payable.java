/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.deitel.java.cap10_polymorphism_and_interfaces;

/**
 *
 * @author victormendonca
 */
public interface Payable {
    
    public abstract double getPaymentAmount();    // sem implementação
    //poderia ser apenas double getPayment.. public abstract já é por default por ser uma interface
    
}
