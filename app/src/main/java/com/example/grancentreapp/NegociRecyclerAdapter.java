package com.example.grancentreapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NegociRecyclerAdapter extends RecyclerView.Adapter<ViewHolderNegoci> implements View.OnClickListener  {
    private List negocisList;
    private View v;
    private int positionT=0;
    private int positionD=0;
    private NegociItemClickListener itemClickListener;
    public NegociRecyclerAdapter(List personalList, NegociItemClickListener itemClickListener){
        this.negocisList = personalList;
        this.itemClickListener = itemClickListener;
    }

    public ViewHolderNegoci onCreateViewHolder(ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_negoci,parent,false);
        return new ViewHolderNegoci(v);
    }

    public void onBindViewHolder( ViewHolderNegoci holder, int position) {
        Glide.with(v).load(((Negoci) negocisList.get(position)).getImg()).into(holder.imgP);
        holder.title.setText(((Negoci) negocisList.get(position)).getTitle());
        holder.trucar.setOnClickListener(this);
        holder.direccio.setOnClickListener(this);
    }

    public int getItemCount() {
        return negocisList.size();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_trucar:
                itemClickListener.onClickBtnTrucar(((Negoci) negocisList.get(positionT)).getTelef());
                if(positionT<4)positionT++;
                else positionT=0;
                break;
            case R.id.bt_direccio:
                itemClickListener.onClickBtnDireccio(((Negoci) negocisList.get(positionD)).getDirec());
                if(positionD<4)positionD++;
                else positionD=0;
                break;
        }

    }
}
