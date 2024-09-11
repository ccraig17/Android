package com.craig.informationbook.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.craig.informationbook.R;
import com.craig.informationbook.adaptor.ViewPagerAdapterWonders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
/*
* In this WondersActivity Class: initialize the the tabLayout and the viewPager2
* Create an object of the ViewPagerAdapterWonders class; this will contain 2 arguments: getSupportFragmentManager() and getLifecycle()
* Attached the adapter to the viewPager2 in order to show the fragments in the Activity
*/
public class WondersActivity extends AppCompatActivity {
    private TabLayout tabLayoutWonders;
    private ViewPager2 viewPagerWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);
        tabLayoutWonders = findViewById(R.id.tabLayoutWonders);
        viewPagerWonders = findViewById(R.id.viewPager2Wonder);

        ViewPagerAdapterWonders adapterWonders = new ViewPagerAdapterWonders(getSupportFragmentManager(), getLifecycle());
        viewPagerWonders.setAdapter(adapterWonders);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutWonders, viewPagerWonders, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position) {
                    case 0:
                        tab.setText("Great Wall Of China");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}