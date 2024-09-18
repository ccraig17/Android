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

public class FragmentEthiopianMuseum extends Fragment {
    public static FragmentEthiopianMuseum newFragment(){
        return new FragmentEthiopianMuseum();
    }
    public ImageView imageEthiopianMuseum;
    public ProgressBar progressBarEthiopianMuseum;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ethiopia_museum, container, false);
        imageEthiopianMuseum = view.findViewById(R.id.imageViewMuseum);
        progressBarEthiopianMuseum = view.findViewById(R.id.progressBarMuseum);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/"+
                "Museo_Nazionale_d%27Etiopia%2C_interno_03.jpg/736px-Museo_Nazionale_d%27Etiopia%2C_interno_03.jpg").into(imageEthiopianMuseum, new Callback() {
            @Override
            public void onSuccess() {
                progressBarEthiopianMuseum.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarEthiopianMuseum.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
