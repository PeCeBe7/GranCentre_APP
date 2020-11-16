package com.example.grancentreapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainWeather extends AppCompatActivity {
    CalendarView calendar;
    TextView dateView;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weather);
        calendar = findViewById(R.id.calender);
        builder = new AlertDialog.Builder(this);
        final ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.hotels);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String Date = dayOfMonth + "-" + (month + 1) + "-" + year;
                String tiempo="";
                Random rand = new Random();
                int n = rand.nextInt(6);
                switch (n){
                    case 0:tiempo="NUBLADO";
                        break;
                    case 1:tiempo="SOLEADO";
                        break;
                    case 2:tiempo="LLUVIA TORRENCIAL";
                        break;
                    case 3:tiempo="NIEVE";
                        break;
                    case 4:tiempo="TORMENTA";
                        break;
                    case 5:tiempo="LLOVIZNA";
                        break;
                }
                builder.setTitle(Date);
                builder.setMessage(tiempo);
                builder.setNeutralButton("OK", null);
                builder.setView(image);


                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}