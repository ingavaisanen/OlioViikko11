package com.example.grocerylist;

import java.lang.String;

public class Grocery {
    private String groceries;
    public String getGroceries() {

        return groceries;
    }
    private String definition;
    public String getDefinition() {

        return definition;
    }


    public Grocery(String groceries, String definition) {
        this.groceries = groceries;
        this.definition = definition;
    }
}
