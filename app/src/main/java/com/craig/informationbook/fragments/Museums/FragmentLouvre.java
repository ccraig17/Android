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

public class FragmentLouvre extends Fragment {
    public static FragmentLouvre newFragment(){
        return new FragmentLouvre();
    }
    public ImageView imageLouvre;
    public ProgressBar progressBarLouvre;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_louvre_museum, container, false);
        imageLouvre = view.findViewById(R.id.imageViewMuseum);
        progressBarLouvre = view.findViewById(R.id.progressBarMuseum);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/"+
                "Louvre_Museum_Wikimedia_Commons.jpg/540px-Louvre_Museum_Wikimedia_Commons.jpg").into(imageLouvre, new Callback() {
            @Override
            public void onSuccess() {
                progressBarLouvre.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarLouvre.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
