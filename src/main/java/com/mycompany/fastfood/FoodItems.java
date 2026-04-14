/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fastfood;

/**
 *
 * @author emcav
 */
public class FoodItems {   
    
    // variables attributes//
    String name;            //Storage the name of the product//  
    int weight;             //Storage the weight as an intiger// 
    String bestBefore;      //Storage the expiration date as a string // 
    String timeAdded;       //Storage the timetamp when the item is created // 

    public FoodItems (String n, int w, String d) {
        this.name = n;      //Assgins to add parameter "n" of name//
        this.weight = w;    //Assgins to add parameter "w" of weight //
        this.bestBefore = d; //Assgins to add parameter "d" of bestBefore//
        this.timeAdded = java.time.LocalTime.now().toString();  // Current system time to a string//
    }
}

