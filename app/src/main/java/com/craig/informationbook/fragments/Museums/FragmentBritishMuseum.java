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

public class FragmentBritishMuseum extends Fragment {
    public static FragmentBritishMuseum newFragment(){
        return new FragmentBritishMuseum();
    }
    public ImageView imageBritishMuseum;
    public ProgressBar progressBarBritishMuseum;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_british_museum, container, false);
        imageBritishMuseum = view.findViewById(R.id.imageViewMuseum);
        progressBarBritishMuseum = view.findViewById(R.id.progressBarMuseum);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/"+
                "British_Museum_%28aerial%29.jpg/500px-British_Museum_%28aerial%29.jpg").into(imageBritishMuseum, new Callback() {
            @Override
            public void onSuccess() {
                progressBarBritishMuseum.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarBritishMuseum.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
