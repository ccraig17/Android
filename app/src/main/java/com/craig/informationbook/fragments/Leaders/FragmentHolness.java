package com.craig.informationbook.fragments.Leaders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.craig.informationbook.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class FragmentHolness extends Fragment {
    public static FragmentHolness newInstance(){
        return new FragmentHolness();
    }
    private CircleImageView imageViewHolness;
    private ProgressBar progressBarHolness;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_holness, container, false);
        imageViewHolness = view.findViewById(R.id.imageViewLeader);
        progressBarHolness = view.findViewById(R.id.progressBarLeader);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/"+
                "Andrew_Holness_Press_%28cropped%29_2.jpg/220px-Andrew_Holness_Press_%28cropped%29_2.jpg").into(imageViewHolness, new Callback() {
            @Override
            public void onSuccess() {
                progressBarHolness.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarHolness.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
