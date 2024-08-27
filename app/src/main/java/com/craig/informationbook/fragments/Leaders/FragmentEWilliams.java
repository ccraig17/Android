package com.craig.informationbook.fragments.Leaders;

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

public class FragmentEWilliams extends Fragment {
    public static FragmentEWilliams newInstance(){
        return new FragmentEWilliams();
    }
    private ImageView imageViewWilliams;
    private ProgressBar progressBarWilliams;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eric_williams, container, false);
        imageViewWilliams = view.findViewById(R.id.imageViewLeader);
        progressBarWilliams = view.findViewById(R.id.progressBarLeader);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/"+
                "Eric_Williams_%28cropped%29.jpg/440px-Eric_Williams_%28cropped%29.jpg").into(imageViewWilliams, new Callback() {
            @Override
            public void onSuccess() {
                progressBarWilliams.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarWilliams.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
