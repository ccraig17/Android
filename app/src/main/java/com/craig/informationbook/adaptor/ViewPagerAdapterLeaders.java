package com.craig.informationbook.adaptor;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.craig.informationbook.fragments.Leaders.FragmentAkufo;
import com.craig.informationbook.fragments.Leaders.FragmentDeSousa;
import com.craig.informationbook.fragments.Leaders.FragmentEWilliams;
import com.craig.informationbook.fragments.Leaders.FragmentHolness;
import com.craig.informationbook.fragments.Leaders.FragmentTinubu;
public class ViewPagerAdapterLeaders extends FragmentStateAdapter {

    public ViewPagerAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0:
                fragment = FragmentEWilliams.newInstance();
                break;
            case 1:
                fragment = FragmentTinubu.newInstance();
                break;
            case 2:
                fragment = FragmentHolness.newInstance();
                break;
            case 3:
                fragment = FragmentAkufo.newInstance();
                break;
            case 4:
                fragment = FragmentDeSousa.newInstance();
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

