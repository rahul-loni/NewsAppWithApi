package com.example.news_application;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context mContext;
    ArrayList<ModelClass> ModelClassArrayList;

    public Adapter(Context mContext, ArrayList<ModelClass> modelClassArrayList) {
        this.mContext = mContext;
        ModelClassArrayList = modelClassArrayList;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.news_layout,null,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder( Adapter.ViewHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,WebView.class);
                intent.putExtra("url",ModelClassArrayList.get(position).getUrl());
                mContext.startActivity(intent);
            }
        });
        holder.date_txt.setText("published At:-",ModelClassArrayList.get(position).getPublishedAt());
        holder.auth_txt.setText(ModelClassArrayList.get(position).getAuthor());
        holder.Heading_txt.setText(ModelClassArrayList.get(position).getTitle());
        holder.des_txt.setText(ModelClassArrayList.get(position).getDescription());
        holder.news_img.setImageResource(ModelClassArrayList.get(position).getUrlToImage());
    }
    @Override
    public int getItemCount() {
        return ModelClassArrayList.size();
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
