package com.craig.informationbook.fragments.Museums;

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

public class FragmentNewYorkMet extends Fragment {
    public static FragmentNewYorkMet newFragment(){
        return new FragmentNewYorkMet();
    }
    public ImageView imageNewYorkMet;
    public ProgressBar progressBarNewYorkMet;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newyork_met, container, false);
        imageNewYorkMet = view.findViewById(R.id.imageViewMuseum);
        progressBarNewYorkMet = view.findViewById(R.id.progressBarMuseum);
        Picasso.get().load("https://encrypted-tbn1.gstatic.com/"+
                "licensed-image?q=tbn:ANd9GcTPRotx5anfliqbmyGEMKBpVMjqIQhdLXYdO_lsKpodatjqinIo1Ql5XTDnRF5Wz0CWatKPFH4b0IaIM100uriNpwm1oI0wxwaiW5pLdCA").into(imageNewYorkMet, new Callback() {
            @Override
            public void onSuccess() {
                progressBarNewYorkMet.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarNewYorkMet.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
