package com.example.grancentreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_business,bt_restaurants,bt_movies,bt_weather,bt_hotels,bt_knowledge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_business = findViewById(R.id.bt_business);
        bt_restaurants = findViewById(R.id.bt_restaurants);
        bt_movies = findViewById(R.id.bt_movies);
        bt_weather = findViewById(R.id.bt_weather);
        bt_hotels = findViewById(R.id.bt_hotels);
        bt_knowledge = findViewById(R.id.bt_knowledge);

        bt_business.setOnClickListener(this);
        bt_restaurants.setOnClickListener(this);
        bt_movies.setOnClickListener(this);
        bt_weather.setOnClickListener(this);
        bt_hotels.setOnClickListener(this);
        bt_knowledge.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.bt_business:
                //Intent intent_business=new Intent(this,ActivityBusiness);
                break;
            case R.id.bt_restaurants:
                //Intent intent_restaurants=new Intent(this,ActivityRestaurants);
                break;
            case R.id.bt_movies:
                Intent intent_movies=new Intent(this,MainMovies.class);
                startActivity(intent_movies);
                break;
            case R.id.bt_weather:
                Intent intent_weather=new Intent(this,MainWeather.class);
                startActivity(intent_weather);
                break;
            case R.id.bt_hotels:
                //Intent intent_hotels=new Intent(this,ActivityHotels);
                break;
            case R.id.bt_knowledge:
                //Intent intent_knowledge=new Intent(this,ActivityKnowledge);
                break;
        }
    }
}