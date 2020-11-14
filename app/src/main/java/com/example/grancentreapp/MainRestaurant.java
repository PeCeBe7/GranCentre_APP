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

    CardView card1;
    CardView card2;
    CardView card3;
    CardView card4;
    CardView card5;
    CardView card6;
    CardView card7;
    CardView card8;
    CardView card9;
    CardView card10;
    CardView card11;
    CardView card12;
    CardView card13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_restaurant);
        card1 = findViewById(R.id.primer);
        card2 = findViewById(R.id.segon);
        card3 = findViewById(R.id.tercer);
        card4 = findViewById(R.id.quart);
        card5 = findViewById(R.id.cinque);
        card6 = findViewById(R.id.sise);
        card7 = findViewById(R.id.sete);
        card8 = findViewById(R.id.vuite);
        card9 = findViewById(R.id.nove);
        card10 = findViewById(R.id.deue);
        card11 = findViewById(R.id.onze);
        card12 = findViewById(R.id.dotze);
        card13 = findViewById(R.id.tretze);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(position == 1)
        {
            card1.setVisibility(View.GONE);
            card2.setVisibility(View.VISIBLE);
            card3.setVisibility(View.GONE);
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.GONE);
            card6.setVisibility(View.VISIBLE);
            card7.setVisibility(View.GONE);
            card8.setVisibility(View.GONE);
            card9.setVisibility(View.GONE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.VISIBLE);
        }
        else
        {
            if(position == 2)
            {
                card1.setVisibility(View.GONE);
                card2.setVisibility(View.GONE);
                card3.setVisibility(View.GONE);
                card4.setVisibility(View.VISIBLE);
                card5.setVisibility(View.GONE);
                card6.setVisibility(View.GONE);
                card7.setVisibility(View.GONE);
                card8.setVisibility(View.VISIBLE);
                card9.setVisibility(View.GONE);
                card10.setVisibility(View.VISIBLE);
                card11.setVisibility(View.GONE);
                card12.setVisibility(View.GONE);
                card13.setVisibility(View.GONE);
            }
            else
            {
                if(position == 3)
                {
                    card1.setVisibility(View.VISIBLE);
                    card2.setVisibility(View.GONE);
                    card3.setVisibility(View.VISIBLE);
                    card4.setVisibility(View.GONE);
                    card5.setVisibility(View.GONE);
                    card6.setVisibility(View.GONE);
                    card7.setVisibility(View.GONE);
                    card8.setVisibility(View.GONE);
                    card9.setVisibility(View.GONE);
                    card10.setVisibility(View.GONE);
                    card11.setVisibility(View.GONE);
                    card12.setVisibility(View.GONE);
                    card13.setVisibility(View.VISIBLE);
                }
                else
                {
                    if(position == 4)
                    {
                        card1.setVisibility(View.GONE);
                        card2.setVisibility(View.GONE);
                        card3.setVisibility(View.GONE);
                        card4.setVisibility(View.GONE);
                        card5.setVisibility(View.VISIBLE);
                        card6.setVisibility(View.GONE);
                        card7.setVisibility(View.VISIBLE);
                        card8.setVisibility(View.GONE);
                        card9.setVisibility(View.VISIBLE);
                        card10.setVisibility(View.GONE);
                        card11.setVisibility(View.VISIBLE);
                        card12.setVisibility(View.GONE);
                        card13.setVisibility(View.GONE);
                    }
                    else
                    {
                        if(position == 5)
                        {
                            card1.setVisibility(View.GONE);
                            card2.setVisibility(View.GONE);
                            card3.setVisibility(View.GONE);
                            card4.setVisibility(View.GONE);
                            card5.setVisibility(View.GONE);
                            card6.setVisibility(View.GONE);
                            card7.setVisibility(View.GONE);
                            card8.setVisibility(View.GONE);
                            card9.setVisibility(View.VISIBLE);
                            card10.setVisibility(View.GONE);
                            card11.setVisibility(View.GONE);
                            card12.setVisibility(View.GONE);
                            card13.setVisibility(View.GONE);
                        }
                        else
                        {
                            if(position == 6)
                            {
                                card1.setVisibility(View.GONE);
                                card2.setVisibility(View.GONE);
                                card3.setVisibility(View.GONE);
                                card4.setVisibility(View.GONE);
                                card5.setVisibility(View.GONE);
                                card6.setVisibility(View.GONE);
                                card7.setVisibility(View.GONE);
                                card8.setVisibility(View.GONE);
                                card9.setVisibility(View.GONE);
                                card10.setVisibility(View.GONE);
                                card11.setVisibility(View.GONE);
                                card12.setVisibility(View.VISIBLE);
                                card13.setVisibility(View.GONE);
                            }
                        }

                    }
                }
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}