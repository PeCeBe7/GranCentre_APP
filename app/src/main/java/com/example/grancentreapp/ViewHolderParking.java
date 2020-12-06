package com.example.grancentreapp;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderParking extends RecyclerView.ViewHolder {
    TextView title,desc1,desc2;
    RatingBar ratingBar;
    ImageView imgP;
    public ViewHolderParking(View itemView) {
        super(itemView);
        imgP = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.titol);
        desc1 = itemView.findViewById(R.id.descT);
        desc2 = itemView.findViewById(R.id.descD);
        ratingBar = itemView.findViewById(R.id.prat1);
        LayerDrawable stars1 = (LayerDrawable) ratingBar.getProgressDrawable();
        stars1.getDrawable(2).setColorFilter(Color.rgb(255, 201, 14), PorterDuff.Mode.SRC_ATOP);
    }
}
