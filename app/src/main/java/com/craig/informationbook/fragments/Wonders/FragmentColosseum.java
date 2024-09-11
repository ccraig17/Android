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

public class FragmentColosseum extends Fragment {
    public static FragmentColosseum newInstance(){
        return new FragmentColosseum();
    }
    private ImageView imageViewColosseum;
    private ProgressBar progressBarColosseum;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_colosseum, container, false);
        imageViewColosseum = view.findViewById(R.id.imageViewWonders);
        progressBarColosseum = view.findViewById(R.id.progressBarWonders);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/"+
                "Colosseo_2020.jpg/540px-Colosseo_2020.jpg").into(imageViewColosseum, new Callback() {
            @Override
            public void onSuccess() {
                progressBarColosseum.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarColosseum.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
