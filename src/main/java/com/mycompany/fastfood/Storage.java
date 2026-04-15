/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fastfood;

/**
 *
 * @author emcav
 */
    public abstract class Storage { //declared as abstract because you do not create a storage object directly this works for stack and demo
    protected FoodItems [] items; //protected array to store fooditems object 
    protected int capacity = 8; // Max capacity allowed
    protected int count = 0; //tracks the current number of items stored in the array 

    public Storage () { //constructor: runs automatically when a child class is instanttiated 
        
        
        items = new FoodItems [capacity]; //initializes the items array with the defined capacity of 8 
    }

    public boolean isFull() { //method to check if the storage has reached maximum limit 
        return count == capacity; // returns true if count is equal to capacity, otherwise retunrs false 
    }

    public boolean isEmpty() { // method to check if the storage has no items 
        return count == 0; // returns true if count 0, otherwise returns false 
    }
}
