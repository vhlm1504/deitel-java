/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap4;

/**
 *
 * @author victormendonca
 */
public class AutoPolicy {
    
    private int accoutNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accoutNumber, String makeAndModel, String state) {
        this.accoutNumber = accoutNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccoutNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(int accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public boolean isNoFaultState()
    {
        boolean noFaultState;
        
        switch(getState())
        {
            case "MA": case "NJ": case "NY": case "PA":
                    noFaultState = true;
                    break;
            default:
                noFaultState = false;
                break;                   
        }
        return noFaultState;
    }
}
