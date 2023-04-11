package com.example.grocerylist;

import java.util.ArrayList;

public class GroceryStorage {
    private ArrayList<Grocery> lGroceries = new ArrayList<>();
    private static GroceryStorage grocerystorage = null;


    private GroceryStorage() {
    }

    public static GroceryStorage getInstance() {
        if (grocerystorage == null) {
            grocerystorage = new GroceryStorage();
        }
        return grocerystorage;
    }

    public ArrayList<Grocery> getNewGroceries() {

        return lGroceries;
    }

    public void addGrocery(Grocery grocery) {

        lGroceries.add(grocery);

    }
}
