package com.example.grancentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_restaurant = findViewById(R.id.bt_restaurants);
        Button bt_hotel = findViewById(R.id.bt_hotels);
        bt_restaurant.setOnClickListener(this);
        bt_hotel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button bt = (Button) v;
        id=getResources().getResourceEntryName(bt.getId());
        switch(id)
        {
            case "bt_restaurants":
                //Intent intentR = new Intent(this,MainRestaurant.class);
                //startActivity(intentR);
                ;break;
            case "bt_hotels":
               // Intent intentH = new Intent(this,MainHotels.class);
                //startActivity(intentH);
                ;break;
        }
    }
}