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

     PagerController pagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallatres);



    }
}