/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap3;

/**
 *
 * @author victormendonca
 */
public class Invoice {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (pricePerItem < 0.0)
        {
            this.pricePerItem = 0.0;
        }
        else
        {
            this.pricePerItem = pricePerItem;           
        }
        
        if (quantity < 0)
        {
            this.quantity = 0;
        }
        else
        {
            this.quantity = quantity;           
        }
    }
    
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantityInStock) {
        this.quantity = quantityInStock;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    public double getInvoiceAmount()
    {
        return this.quantity * this.pricePerItem;
    }
    
    
    
    
    
    
}
