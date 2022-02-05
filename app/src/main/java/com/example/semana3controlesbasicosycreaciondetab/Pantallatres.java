package com.example.semana3controlesbasicosycreaciondetab;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.example.semana3controlesbasicosycreaciondetab.Controles.PagerController;


public class Pantallatres extends AppCompatActivity {

    TabLayout MenuTab;

     ViewPager viewPager;

     TabItem Desayunosaludable,Almuerzosaludable,Cenasaludabe,Meriendasaludable;

  PagerController PagerAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallatres);

        MenuTab = findViewById(R.id.tablayout);

        viewPager = findViewById(R.id.Viewuno);

        Desayunosaludable = findViewById(R.id.Desayunosaludable);
        Almuerzosaludable = findViewById(R.id.Almuerzosaludable);
        Cenasaludabe= findViewById(R.id.Cenasaludabe);
        Meriendasaludable= findViewById(R.id.Meriendasaludable);

        PagerAdapter = new PagerController(getSupportFragmentManager(),MenuTab.getTabCount());

        MenuTab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Obtenemos la posición del tab a mostrar
                viewPager.setCurrentItem(tab.getPosition());
                // Determinar cual fragment se presenta
                if(tab.getPosition()==0){
                    PagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==1){
                    PagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==2){
                    PagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(MenuTab));


    }
}



