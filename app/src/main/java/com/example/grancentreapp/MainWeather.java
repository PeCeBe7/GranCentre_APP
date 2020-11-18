package com.example.grancentreapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Random;

public class MainWeather extends AppCompatActivity {
    private CalendarView calendar;
    private TextView dateView;
    private AlertDialog.Builder builder;
    private int numAle=6;
    private AlertDialog dialog;
    private ImageView imgWeather;
    private TextView tvWeather,tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weather);
        calendar = findViewById(R.id.calender);
        builder = new AlertDialog.Builder(this);
        builder.setNeutralButton("OK", null);

        final Random rand = new Random();

        final View viewDialog= getLayoutInflater().inflate(R.layout.layout_dialog,null);
        builder.setView(viewDialog);
        imgWeather=viewDialog.findViewById(R.id.imgWeather);
        tvWeather=viewDialog.findViewById(R.id.tvWeather);
        tvDate=viewDialog.findViewById(R.id.tvDate);
        dialog = builder.create();

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = dayOfMonth + "-" + (month + 1) + "-" + year;
                String tiempo="",urlImagen="";
                numAle = rand.nextInt(6);
                switch (numAle){
                    case 0:tiempo="Nublado";
                           urlImagen="https://image.flaticon.com/icons/png/512/1163/1163763.png";
                        break;
                    case 1:tiempo="Soleado";
                           urlImagen="https://i.pinimg.com/originals/9f/1f/9d/9f1f9df16846f85e4cab03fa668be990.png";
                        break;
                    case 2:tiempo="Lluvia Torrencial";
                           urlImagen="https://us.123rf.com/450wm/apvaper/apvaper1801/apvaper180100051/94376913-chuva-com-o-%C3%ADcone-de-vento-etiqueta-do-tempo-para-a-web-no-fundo-branco-ilustra%C3%A7%C3%A3o-em-vetor-dos-desenhos.jpg?ver=6";
                        break;
                    case 3:tiempo="Nieve";
                           urlImagen="https://laverdadnoticias.com/__export/1577326980858/sites/laverdad/img/2019/12/25/emoji_nube_con_nieve.jpg_423682103.jpg";
                        break;
                    case 4:tiempo="Tormenta";
                           urlImagen="https://www.educima.com/imagen-01-tormenta-dl9949.jpg";
                        break;
                    case 5:tiempo="Lluvia";
                           urlImagen="https://zonacachonera.files.wordpress.com/2016/11/dibujo-gotas-lluvia.png";
                        break;
                }
                tvDate.setText(date);
                tvWeather.setText(tiempo);
                Glide.with(viewDialog).load(urlImagen).into(imgWeather);
                dialog.show();
            }
        });

    }
}