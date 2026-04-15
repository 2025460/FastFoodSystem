/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fastfood;

/**
 *
 * @author emcav
 */
    public class Queue_Demo extends Storage {  //Queue inherits from storage to acces items array and shared methods 
    private int front = -1, rear = -1; // pointers to track the front (exit) and rear (entry) of the queue 

    public void addFood(FoodItems item) { // method to add in item to the end of the queue (enqueue)
        if (isFull()) { // check if the array is full using the method from the parent class
            System.out.println("Storage Full!");
        } else {
            if (front == -1) front = 0; //if adding the very first element, set the pointer to index 0
            rear++;
            items[rear] = item; // icrement the rear pointer and store the item at that new position 
            count++; //  increment the total item count
            System.out.println(item.name + " added to Queue."); // print confirmation of the added items name 
        }
    }

    public void removeFood() { //method to remove item at the front of the queue (dequeue)
        if (isEmpty()) { // validate if there are items aviable to remove 
            System.out.println("Empty!"); 
        } else {
            System.out.println("Removed: " + items[front].name); // print the name of the item begin removed (always from the front//
            if (front == rear) { // if front equals rear, we just removed the last remaining item 
                front = rear = -1; // reset both pointers to -1 to signify the queue is empty again
            } else { 
                front++; // pointers forward to the next item in line 
            }
            count--;    //decrement the total item count 
        }
    }

    public void peek() { // method to look at the next item in line without removing it 
        if (isEmpty()) System.out.println("Empty."); //standar check for an empty queue
        else System.out.println("Item at the front: " + items[front].name); // displays the item currently sitting at the fron index 
    }

    public void display() { // method to list all items currently in the queue 
        if (isEmpty()) System.out.println("Empty."); // check if there is anything to display 
        else {
            for (int i = front; i <= rear; i++) { // loop from the current fornt position to the current rear position   
                System.out.println("- " + items[i].name); // prints each item name in the console 
            }
        }
    }
}