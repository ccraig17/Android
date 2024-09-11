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

import de.hdodenhof.circleimageview.CircleImageView;

public class FragmentGreatWall extends Fragment {
    public static FragmentGreatWall newInstance(){
        return new FragmentGreatWall();
    }
    private ImageView imageViewGreatWall;
    private ProgressBar progressBarGreatWall;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_great_wall_of_china, container, false);
        imageViewGreatWall = view.findViewById(R.id.imageViewWonders);
        progressBarGreatWall = view.findViewById(R.id.progressBarWonders);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/"+
                "The_Great_Wall_of_China_at_Jinshanling-edit.jpg/250px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg").into(imageViewGreatWall, new Callback() {
            @Override
            public void onSuccess() {
                progressBarGreatWall.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarGreatWall.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
