/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individual2;

/**
 *
 * @author Z-V
 */
public class Telephone {
    private String model;
    private String number;
    private String colour;
    private boolean cellular;

    public Telephone(String model, String number, String colour, boolean cellular) {
        this.model = model;
        this.number = number;
        this.colour = colour;
        this.cellular = cellular;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isCellular() {
        return cellular;
    }

    public void setCellular(boolean cellular) {
        this.cellular = cellular;
    }
    
    @Override
    public String toString(){
        return "Telephone = { Model = " + model +
                " Number = " + number + 
                " Colour = " + colour +
                " Cellular = " + cellular +"}";
    }
}
