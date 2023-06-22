package com.example.news_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    String api="ba8f7e7f52a94f00b98d76a9217de810";
    Toolbar toolbar;
    TabLayout tabLayout;
    TabItem home,sports,entertainment,technology,politics;
    PageAdapter pageAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setSupportActionBar(toolbar);
    }
    public void init(){
        toolbar=findViewById(R.id.toolbar);
        tabLayout=findViewById(R.id.tablayout);
        home=findViewById(R.id.tabHome);
        sports=findViewById(R.id.tabSports);
        entertainment=findViewById(R.id.tabEntertainment);
        technology=findViewById(R.id.tabTechnology);
        politics=findViewById(R.id.tabPolitics);


        pageAdapter=new PageAdapter(getSupportFragmentManager(),6);

        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
            if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2
            ||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                pageAdapter.notifyDataSetChanged();
            }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}