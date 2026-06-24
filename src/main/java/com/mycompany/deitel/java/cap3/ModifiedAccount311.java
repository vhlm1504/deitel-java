/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap3;

/**
 *
 * @author victormendonca
 */
public class ModifiedAccount311 {
   
    private String name;
    private double balance;
    
    public ModifiedAccount311(String name, double balance)
    {
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
    }
    
    public ModifiedAccount311(String name)
    {
        this.name = name;
    }
    
    public ModifiedAccount311()
    {
        this.name = null;
        this.balance = 0.0;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    
    public void deposit(double depositAmount)
    {
        if(depositAmount > 0.0)
            balance += depositAmount;
    }
    
    public void withdraw(double amount)
    {
        if(this.balance > amount)
        {
            this.balance -= amount;
        }
        else
        {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }
    
}
