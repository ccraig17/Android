package com.craig.informationbook.fragments.Wonders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.craig.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentVictoriaFalls extends Fragment {
    public static FragmentVictoriaFalls newInstance(){
        return new FragmentVictoriaFalls();
    }
    private ImageView imageViewVictoriaFalls;
    private ProgressBar progressBarVictoriaFalls;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_victoria_falls, container, false);
        imageViewVictoriaFalls = view.findViewById(R.id.imageViewWonders);
        progressBarVictoriaFalls = view.findViewById(R.id.progressBarWonders);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/"+
                "Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_16-20_PAN.jpg/1600px-Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_16-20_PAN.jpg").into(imageViewVictoriaFalls, new Callback() {
            @Override
            public void onSuccess() {
                progressBarVictoriaFalls.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarVictoriaFalls.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
