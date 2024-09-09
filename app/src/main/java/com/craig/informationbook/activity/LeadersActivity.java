package com.craig.informationbook.activity;

import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.craig.informationbook.R;
import com.craig.informationbook.adaptor.ViewPagerAdapterLeaders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LeadersActivity extends AppCompatActivity {
    private TabLayout tabLayoutLeader;
    private ViewPager2 viewPagerLeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);
        tabLayoutLeader = findViewById(R.id.tabLayoutLeaders);
        viewPagerLeader = findViewById(R.id.viewPagerLeaders);

        ViewPagerAdapterLeaders adapterLeaders = new ViewPagerAdapterLeaders(getSupportFragmentManager(), getLifecycle());
        viewPagerLeader.setAdapter(adapterLeaders);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutLeader, viewPagerLeader, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position){
                    case 0:
                        tab.setText("Dr. Eric Williams");
                        break;
                    case 1:
                        tab.setText("Dr. Tinubu");
                        break;
                    case 2:
                        tab.setText("Andrew Holness");
                        break;
                    case 3:
                        tab.setText("Nana Akufo Addo");
                        break;
                    case 4:
                        tab.setText("Marcelo Rebelo de Sousa");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}