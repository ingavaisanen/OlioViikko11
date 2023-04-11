package com.example.grocerylist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    TextView GroceryName, GroceryDefinition;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);

        GroceryName = itemView.findViewById(R.id.tvgrocery);
        GroceryDefinition = itemView.findViewById(R.id.tvDefinition);
    }
}
