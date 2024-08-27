package com.craig.informationbook.adaptor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.craig.informationbook.fragments.Countries.FragmentGhana;
import com.craig.informationbook.fragments.Countries.FragmentJamaica;
import com.craig.informationbook.fragments.Countries.FragmentJapan;
import com.craig.informationbook.fragments.Countries.FragmentNigeria;
import com.craig.informationbook.fragments.Countries.FragmentPortugal;
import com.craig.informationbook.fragments.Countries.FragmentTrinidad;

public class ViewPagerAdapterCountries extends FragmentStateAdapter {
    public ViewPagerAdapterCountries(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
            switch(position){
                case 0:
                    fragment = FragmentTrinidad.newInstance();
                    break;
                case 1:
                    fragment = FragmentNigeria.newInstance();
                    break;
                case 2:
                    fragment = FragmentJamaica.newInstance();
                    break;
                case 3:
                    fragment = FragmentGhana.newInstance();
                    break;
                case 4:
                    fragment = FragmentPortugal.newInstance();
                    break;
                case 5:
                    fragment = FragmentJapan.newInstance();
                    break;
                default:
                    return null;
                }
        return fragment;
    }

    @Override
    public int getItemCount()   {
        return 6;
    }
}
