package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.lang.String;

public class addGroceriesActivity extends AppCompatActivity {

    public EditText editGrocery;
    public EditText editDefinition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_groceries);

    }

    public void addGrocery(View view) {
        editGrocery = (EditText)findViewById(R.id.txtG);
        String groceries = editGrocery.getText().toString();
        editDefinition = (EditText)findViewById(R.id.txtD);
        String definition = editDefinition.getText().toString();

        GroceryStorage.getInstance().addGrocery(new Grocery(groceries, definition));

    }

    public void switchToList(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
