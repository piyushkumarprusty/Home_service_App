package com.example.android.myapplication.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrdersAdapter {
    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView orderImage;
        TextView soldImage , orderNumber , price;

        public viewHolder(@NonNull  View itemView) {
            super(itemView);
        }
    }
}
