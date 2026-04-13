package com.mycompany.fastfood;

/**
 *
 * @author emcav
 */
    public abstract class Storage {
    protected FoodItems [] items;
    protected int capacity = 8; // Max capacity allowed
    protected int count = 0;

    public Storage () {
        
        
        items = new FoodItems [capacity];
    }

    public boolean isFull() {
        return count == capacity;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
