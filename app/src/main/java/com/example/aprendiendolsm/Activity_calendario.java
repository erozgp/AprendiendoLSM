package com.example.aprendiendolsm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.aprendiendolsm.controladorCalendario.PagerController1;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Activity_calendario extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem DiasSemana, Meses, Estaciones;

    PagerController1 pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        tabLayout = findViewById(R.id.layoutCalendario);
        viewPager = findViewById(R.id.ViewPagerCalendario);
        DiasSemana = findViewById(R.id.DiasSemana);
        Meses = findViewById(R.id.Meses);
        Estaciones = findViewById(R.id.Estaciones);

        pagerAdapter = new PagerController1(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if ((tab.getPosition() == 0) || (tab.getPosition() == 1) || (tab.getPosition() == 2) ){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btbInfo:
                Intent intent = new Intent(getBaseContext(), Informacion.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
