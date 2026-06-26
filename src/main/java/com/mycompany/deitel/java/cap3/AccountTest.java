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
public class AccountTest {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //java.lang.System.in in é um atributo, uma variável de instância
        //in é uma constante na verdade, public static final InputStream in; e guarda uma referência para o objeto 
        //InputStream que é a entrada padrão pelo teclado
        
        /*
        Account myAccount = new Account();
        
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        System.out.printf("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName()); 
        
        Account newAccount = new Account("Jane Green");
        
        System.out.printf("Initial name is: %s%n%n", newAccount.getName());
        
        System.out.printf("Please enter the name: ");
        theName = input.nextLine();
        newAccount.setName(theName);
        System.out.println();
        
        System.out.printf("Name in object newAccount is: %n%s%n", newAccount.getName());   
        
        Account oneMoreAccount = new Account("Cissa Mendonça", 50000.00);
        
        System.out.printf("Initial name is: %s %f %n%n", oneMoreAccount.getName(), oneMoreAccount.getBalance());
        
        System.out.printf("Please enter the name: ");
        theName = input.nextLine();
        oneMoreAccount.setName(theName);
        System.out.println("Please enter the new balance: ");
        double newBalance = input.nextDouble();
        input.nextDouble();
        oneMoreAccount.setBalance(newBalance);
        System.out.println();
        
        System.out.printf("Name and balance in object oneMoreAccount is: %n%s %f %n", oneMoreAccount.getName(), oneMoreAccount.getBalance());
        System.out.printf("faça um depósito: ");
        newBalance = input.nextDouble();
        input.nextDouble()
        oneMoreAccount.deposit(newBalance);
        System.out.println("conta: " + oneMoreAccount.getBalance());
        */
        /*311
        ModifiedAccount311 conta = new ModifiedAccount311("Cissa", 100000);
        System.out.printf("Saldo conta: %f%n%n", conta.getBalance());
        System.out.println("Quanto quer sacar? ");
        double saque = input.nextDouble();
        input.nextDouble()
        conta.withdraw(saque);
        System.out.printf("Saldo conta: %n%f%n", conta.getBalance());
        */
        
        input.close();
    }
}
