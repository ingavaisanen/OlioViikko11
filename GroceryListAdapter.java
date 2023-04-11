package com.example.grocerylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    private Context context;
    private ArrayList<Grocery> lGroceries = new ArrayList<>();

    public GroceryListAdapter(Context context, ArrayList<Grocery> lGroceries) {
        this.context = context;
        this.lGroceries = lGroceries;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroceryViewHolder(LayoutInflater.from(context).inflate(R.layout.grocery_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        holder.GroceryName.setText(lGroceries.get(position).getGroceries());
        holder.GroceryDefinition.setText("Muista: " + lGroceries.get(position).getDefinition());
    }

    @Override
    public int getItemCount() {
        return lGroceries.size();
    }
}
