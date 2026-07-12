/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap10;

/**
 *
 * @author victormendonca
 */
public class Invoice implements Payable{
    
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    {
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
        this.partDescription = partDescription;
        this.partNumber = partNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        
        if(quantity < 0)
            throw new IllegalArgumentException("Quantity must be >= 0");
        
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        
        if(pricePerItem < 0.0)
            throw new IllegalArgumentException("Price per item must be >= 0.0");
        
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
        
    }
    
    @Override 
    public double getPaymentAmount() //se a classe concreta não implementar todos os métodos da interface, então, obrigatoriamente ela deverá ser uma calsse abstrata
    {
        return getQuantity() * getPricePerItem();
    }
    
    
}
