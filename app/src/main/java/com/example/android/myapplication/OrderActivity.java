package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.android.myapplication.Adapters.OrdersAdapter;
import com.example.android.myapplication.Models.OrdersModel;
import com.example.android.myapplication.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list =  new ArrayList<>();
        OrdersModel ordersModel = new OrdersModel(R.drawable.as,"Hosuer re" , "28" , "REw123");
        list.add(ordersModel);

        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));
        list.add(new OrdersModel(R.drawable.car2,"car repair" , "20" ,"ASDF123" ));

        OrdersAdapter  adapter = new OrdersAdapter(list , this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}