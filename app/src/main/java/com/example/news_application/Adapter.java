package com.example.news_application;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @Override
    public Adapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder( Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Heading_txt,des_txt,auth_txt,date_txt;
        ImageView news_img;
        CardView cardView;

     public ViewHolder(View itemView){
         super(itemView);
         Heading_txt=itemView.findViewById(R.id.heading);
         des_txt=itemView.findViewById(R.id.des);
         auth_txt=itemView.findViewById(R.id.auth);
         date_txt=itemView.findViewById(R.id.date);
         news_img=itemView.findViewById(R.id.news_img);
         cardView=itemView.findViewById(R.id.card);
     }
    }
}
