package com.craig.informationbook.adaptor;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.craig.informationbook.fragments.Museums.FragmentBritishMuseum;
import com.craig.informationbook.fragments.Museums.FragmentEthiopianMuseum;
import com.craig.informationbook.fragments.Museums.FragmentLouvre;
import com.craig.informationbook.fragments.Museums.FragmentNewYorkMet;
import com.craig.informationbook.fragments.Museums.FragmentVatican;

public class ViewPagerAdapterMuseum extends FragmentStateAdapter {
    public ViewPagerAdapterMuseum(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0:
                fragment = FragmentLouvre.newFragment();
                break;
            case 1:
                fragment = FragmentVatican.newFragment();
                break;
            case 2:
                fragment = FragmentBritishMuseum.newFragment();
                break;
            case 3:
                fragment = FragmentNewYorkMet.newFragment();
                break;
            case 4:
                fragment = FragmentEthiopianMuseum.newFragment();
                break;
            default:
                return null;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
