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

public class ViewHolderNegoci extends RecyclerView.ViewHolder{
    TextView title;
    Button trucar,direccio;
    ImageView imgP;
    public ViewHolderNegoci(View itemView) {
        super(itemView);
        imgP = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.titol);
        trucar = itemView.findViewById(R.id.bt_trucar);
        direccio = itemView.findViewById(R.id.bt_direccio);
    }
}
