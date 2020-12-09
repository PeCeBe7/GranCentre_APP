package com.example.grancentreapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainBusines extends AppCompatActivity implements NegociItemClickListener {
    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;
    NegociRecyclerAdapter adapter;
    private ArrayList<Negoci> negocisList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_busines);
        recyclerView = findViewById(R.id.rvNegocis);
        negocisList = new ArrayList<Negoci>();
        negocisList.add(new Negoci("data:image/png;base64,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","Albi Mobiliari","+34938704237","http://albimobiliari.com/"));
        negocisList.add(new Negoci("https://lh3.googleusercontent.com/proxy/EJC__wEvqiH0tT1Khup7LGglikFx-CHCt_jwXUjnEAB4TeQ66U8-MsaKLkrrflI1T-cEkrE_gJNF3d4aifpWZeXQYiyoQCi8O0Ym326FAuhV2YeZG2CuQ1Wwwd9PdPkyDyJbIbAi8_hAPabu","Game","+34938277282","https://www.game.es/"));
        negocisList.add(new Negoci("https://i.pinimg.com/originals/03/69/01/0369012a60fbcb08648ee9adbe7deed8.png","Zara","+34938792532","https://www.zara.com/es/"));
        negocisList.add(new Negoci("https://cooperativa.abacus.coop/app/uploads/2018/02/cap-noti-50-abacus.jpg","Abacus","+34938604586","https://www.abacus.coop/es/home"));

        layoutManager = new LinearLayoutManager(getApplicationContext());

        adapter = new NegociRecyclerAdapter(negocisList,this);

        recyclerView.setHasFixedSize(true);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClickBtnTrucar(String telef) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + telef));
        startActivity(intent);
    }

    @Override
    public void onClickBtnDireccio(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}