package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private GroceryStorage grocerystorage;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grocerystorage = GroceryStorage.getInstance();
        recyclerview = findViewById(R.id.rvGroceryList);

        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(new GroceryListAdapter(getApplicationContext(), grocerystorage.getNewGroceries()));
    }

    public void switchToAddGrocery(View view) {
        Intent intent = new Intent(this, addGroceriesActivity.class);
        startActivity(intent);
    }
}
