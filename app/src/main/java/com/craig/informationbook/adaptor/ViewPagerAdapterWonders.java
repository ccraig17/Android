package com.craig.informationbook.adaptor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.craig.informationbook.fragments.Wonders.FragmentChrisRedeemer;
import com.craig.informationbook.fragments.Wonders.FragmentColosseum;
import com.craig.informationbook.fragments.Wonders.FragmentGreatWall;
import com.craig.informationbook.fragments.Wonders.FragmentPetra;
import com.craig.informationbook.fragments.Wonders.FragmentPyramid;
import com.craig.informationbook.fragments.Wonders.FragmentTajMahal;
import com.craig.informationbook.fragments.Wonders.FragmentVictoriaFalls;

public class ViewPagerAdapterWonders extends FragmentStateAdapter {
    public ViewPagerAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch(position){
            case 0:
                fragment = FragmentGreatWall.newInstance();
                break;
            case 1:
                fragment = FragmentTajMahal.newInstance();
                break;
            case 2:
                fragment = FragmentChrisRedeemer.newInstance();
                break;
            case 3:
                fragment = FragmentColosseum.newInstance();
                break;
            case 4:
                fragment = FragmentPetra.newInstance();
                break;
            case 5:
                fragment = FragmentPyramid.newInstance();
                break;
            case 6:
                fragment = FragmentVictoriaFalls.newInstance();
                break;
            default:
                return null;
        }
        return fragment;
    }
    @Override
    public int getItemCount(){
        return 7;
    }
}
