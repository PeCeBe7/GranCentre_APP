package com.example.grancentreapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;
    ParkingItemRecyclerView adapter;

    List parkingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.rvParking);

        parkingList.add(new Parking("https://fastly.4sqi.net/img/general/600x600/2477735_gKbqCGTNiYLdbYKy0i-rYA8ClUL19CGX3zxXdsswa7U.jpg","Parquing Can Trullas","Places totals:100","Places disponibles: 36"));
        parkingList.add(new Parking("https://prod-assets.onepark.fr/media/W1siZiIsIjIwMTgvMDEvMzEvMTIvMDIvMDkvNjk4L09uZXBhcmtfMjBwYXJraW5nXzIwYXRlbmVhXzIwY29sb20uanBnIl0sWyJwIiwidGh1bWIiLCI3Mjh4NzI4IyIseyJmb3JtYXQiOiJqcGcifV1d/Parking%20P%C3%BAblico%20COLOM%20%28Cubierto%29?sha=7521844e8f22edaf","Parquing public Colom","Places totals:180","Places disponibles: 140"));
        parkingList.add(new Parking("https://www.granollers.cat/sites/default/files/Mobilitat/aparcament_marge.jpg","Parquing el Sot","Places totals:700","Places disponibles: 567"));
        parkingList.add(new Parking("https://media.parkimeter.com/images/parkings/medium/94-85249d027302b4423244e9e013df6b26.jpg","Parquing els Blaus","Places totals:180","Places disponibles: 140"));

        layoutManager = new LinearLayoutManager(getApplicationContext());

        adapter = new ParkingItemRecyclerView(parkingList);

        recyclerView.setHasFixedSize(true);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }
}
