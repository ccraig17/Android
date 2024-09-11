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

public class FragmentChrisRedeemer extends Fragment {
    public static FragmentChrisRedeemer newInstance(){
        return new FragmentChrisRedeemer();
    }
    private ImageView imageViewRedeemr;
    private ProgressBar progressBarRedeemer;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chris_redeemer, container, false);
        imageViewRedeemr = view.findViewById(R.id.imageViewWonders);
        progressBarRedeemer = view.findViewById(R.id.progressBarWonders);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/"+
                "Christ_the_Redeemer_-_Cristo_Redentor.jpg/440px-Christ_the_Redeemer_-_Cristo_Redentor.jpg").into(imageViewRedeemr, new Callback() {
            @Override
            public void onSuccess() {
                progressBarRedeemer.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarRedeemer.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
