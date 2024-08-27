package com.craig.informationbook.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.craig.informationbook.R;
import com.craig.informationbook.adaptor.ViewPagerAdapterCountries;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountryActivity extends AppCompatActivity {
    private TabLayout tabLayoutCountries;
    private ViewPager2 viewPagerCountries;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutCountries = findViewById(R.id.tabLayoutCountries);
        viewPagerCountries = findViewById(R.id.viewPagerCountries);

        ViewPagerAdapterCountries adapter = new ViewPagerAdapterCountries(getSupportFragmentManager(),getLifecycle());
        viewPagerCountries.setAdapter(adapter);

        //TabLayout Mediator Class is used to bind the viewPager and components.
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutCountries, viewPagerCountries, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) { //tab object represents each Tab, the position is the variable position - determines the text tab
                switch(position){
                    case 0:
                        tab.setText("Trinidad & Tobago");
                        break;
                    case 1:
                        tab.setText("Nigeria");
                        break;
                    case 2:
                        tab.setText("Jamaica");
                        break;
                    case 3:
                        tab.setText("Ghana");
                        break;
                    case 4:
                        tab.setText("Portugal");
                        break;
                    case 5:
                        tab.setText("Japan");
                        break;
                }
            }
        });
        tabLayoutMediator.attach(); //links the tabLayout and the ViewPager2 together link the RecyclerViewLayout with adapter.

    }
}