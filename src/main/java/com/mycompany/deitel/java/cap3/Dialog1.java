/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap3;
import javax.swing.JOptionPane;

/**
 *
 * @author victormendonca
 */
public class Dialog1 {
    
    public static void main(String[] args) {
        //JOptionPane message = new JOptionPane();
        //message.showMessageDealog(null, "Welcome to Java");// showMessageDialog() é um método static, não é chamado pelo objeto só pela classe diretamente
        JOptionPane.showMessageDialog(null, "Welcome to Java");
        
        String name = JOptionPane.showInputDialog("What is your name?"); //return String containing the characters typed by the user
        if(name == null || name.isBlank() == true)
        {
            JOptionPane.showMessageDialog(null, "Nenhum nome digitado, programa encerrado.");
            return;
        }
        String message = String.format("Welcome, %s, to Java Programming!", name);
        JOptionPane.showMessageDialog(null, message);
    }
    
}
