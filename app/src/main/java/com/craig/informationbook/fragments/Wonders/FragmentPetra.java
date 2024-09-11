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

public class FragmentPetra extends Fragment {
    public static FragmentPetra newInstance(){
        return new FragmentPetra();
    }
    private ImageView imageViewPetra;
    private ProgressBar progressBarPetra;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_petra, container, false);
        imageViewPetra = view.findViewById(R.id.imageViewWonders);
        progressBarPetra = view.findViewById(R.id.progressBarWonders);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/" +
                "Treasury_petra_crop.jpeg/400px-Treasury_petra_crop.jpeg").into(imageViewPetra, new Callback() {
            @Override
            public void onSuccess() {
                progressBarPetra.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarPetra.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
