package com.example.recyclerview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.itemList;
import com.example.recyclerview.R;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.myViewHolder>{
    public itemList[] datalist;

    public itemAdapter(itemList[] datalist) {
        this.datalist = datalist;
    }

    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View myview = inflater.inflate(R.layout.single_row_item,parent,false);
        return new myViewHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
//        final itemList data_position = datalist[position];
        holder.foodtitle.setText(datalist[position].getFoodtitle());
        holder.foodImg.setImageResource(datalist[position].getImageId());
        String foodtitle_position = datalist[position].getFoodtitle();
        holder.layout .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return datalist.length;
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        private TextView foodtitle;
        private ImageView foodImg;
        private CardView layout;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImg=itemView.findViewById(R.id.imageview);
            foodtitle=itemView.findViewById(R.id.textview);
            layout = itemView.findViewById(R.id.cardview_layout);
        }
    }
}
