package com.example.grancentreapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainRestaurant extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_restaurant);
        CardView card1 = findViewById(R.id.primer);
        CardView card2 = findViewById(R.id.segon);
        CardView card3 = findViewById(R.id.tercer);
        CardView card4 = findViewById(R.id.quart);
        CardView card5 = findViewById(R.id.cinque);
        CardView card6 = findViewById(R.id.sise);
        CardView card7 = findViewById(R.id.sete);
        CardView card8 = findViewById(R.id.vuite);
        CardView card9 = findViewById(R.id.nove);
        CardView card10 = findViewById(R.id.deue);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}