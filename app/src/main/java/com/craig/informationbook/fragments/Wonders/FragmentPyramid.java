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

public class FragmentPyramid extends Fragment {
    public static FragmentPyramid newInstance(){
        return new FragmentPyramid();
    }
    private ImageView imageViewPyramid;
    private ProgressBar progressBarPyramid;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pyramid, container, false);
        imageViewPyramid = view.findViewById(R.id.imageViewWonders);
        progressBarPyramid = view.findViewById(R.id.progressBarWonders);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/"+
                "Kheops-Pyramid.jpg/600px-Kheops-Pyramid.jpg").into(imageViewPyramid, new Callback() {
            @Override
            public void onSuccess() {
                progressBarPyramid.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarPyramid.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
