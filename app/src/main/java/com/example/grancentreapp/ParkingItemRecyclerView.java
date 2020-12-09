package com.example.grancentreapp;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ParkingItemRecyclerView extends RecyclerView.Adapter<ViewHolderParking>{
    private List parkingList;
    private View v;
    public ParkingItemRecyclerView(List personalList){
        this.parkingList = personalList;
    }

    @Override
    public ViewHolderParking onCreateViewHolder(ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_parking,parent,false);
        return new ViewHolderParking(v);
    }

    @Override
    public void onBindViewHolder(ViewHolderParking holder, int position) {
        Glide.with(v).load(((Parking) parkingList.get(position)).getImg()).into(holder.imgP);
        holder.title.setText(((Parking) parkingList.get(position)).getTitle());
        holder.desc1.setText(((Parking) parkingList.get(position)).getDesc1());
        holder.desc2.setText(((Parking) parkingList.get(position)).getDesc2());
    }

    @Override
    public int getItemCount() {
        return parkingList.size();
    }
}
