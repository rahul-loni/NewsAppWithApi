package com.example.news_application;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    String api="ba8f7e7f52a94f00b98d76a9217de810";
    ArrayList<ModelClass>ModelClassArrayList;
    Adapter adapter;
    String country ="US";
    private RecyclerView recyclerView;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.homefragment,null);
        recyclerView=v.findViewById(R.id.homerecycler);
        ModelClassArrayList=new ArrayList<>();
        adapter=new Adapter(getContext(),ModelClassArrayList);
        recyclerView.setAdapter(adapter);
        return v;
    }
}
