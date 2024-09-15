package com.craig.informationbook.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.craig.informationbook.R;
import com.craig.informationbook.adaptor.ViewPagerAdapterMuseum;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MuseumsActivity extends AppCompatActivity {
    TabLayout tabLayoutMuseum;
    ViewPager2 viewPager;
    ViewPagerAdapterMuseum viewPagerAdapterMuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
        tabLayoutMuseum = findViewById(R.id.tabLayoutMuseums);
        viewPager = findViewById(R.id.viewPager2Museums);
        viewPagerAdapterMuseum = new ViewPagerAdapterMuseum(getSupportFragmentManager(), getLifecycle());
        viewPager.setAdapter(viewPagerAdapterMuseum);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutMuseum, viewPager, true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch(position){
                    case 0:
                        tab.setText(R.string.louvre);
                        break;

                }
            }
        });
        tabLayoutMediator.attach();

    }
}