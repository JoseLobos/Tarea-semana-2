package com.example.semana3controlesbasicosycreaciondetab;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.example.semana3controlesbasicosycreaciondetab.Controles.PagerContraller;


public class Pantallatres extends AppCompatActivity {

    TabLayout tablayout;

     ViewPager Viewuno;

     TabItem Desayunosaludable,Almuerzosaludable,Cenasaludabe,Meriendasaludable;

     PagerContraller pagerAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallatres);

        tablayout = findViewById(R.id.tablayout);

        Viewuno = findViewById(R.id.Viewuno);

        Desayunosaludable = findViewById(R.id.Desayunosaludable);
        Almuerzosaludable = findViewById(R.id.Almuerzosaludable);
        Cenasaludabe= findViewById(R.id.Cenasaludabe);
        Meriendasaludable= findViewById(R.id.Meriendasaludable);

        pagerAdapter = new PagerContraller(getSupportFragmentManager(),tablayout.getTabCount());

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                Viewuno.setCurrentItem(tab.getPosition());

                if (tab.getPosition()==0) {

                    pagerAdapter.notifyDataSetChage();
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