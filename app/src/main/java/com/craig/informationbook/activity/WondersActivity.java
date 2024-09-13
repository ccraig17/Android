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
* Using the switch statement and the position of the fragment, set the title of the tab within the TabLayoutMediator
* tabLayoutMediator.attach() will attach the tabLayouts to the viewPager2
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
                    case 1:
                        tab.setText("Taj Mahal");
                        break;
                    case 2:
                        tab.setText("Christ The Redeemer");
                        break;
                    case 3:
                        tab.setText("Colosseum");
                        break;
                    case 4:
                        tab.setText("Petra");
                        break;
                    case 5:
                        tab.setText("The Pyramid Of Giza");
                        break;
                    case 6:
                        tab.setText("Victoria Falls");
                        break;
                    default:
                        tab.setText("Great Wall Of China");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}