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

public class FragmentTajMahal extends Fragment {
    public static FragmentTajMahal newInstance(){
        return new FragmentTajMahal();
    }
    private ImageView imageViewTajMahal;
    private ProgressBar progressBarTajMahal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tajmahal, container, false);
        imageViewTajMahal = view.findViewById(R.id.imageViewWonders);
        progressBarTajMahal = view.findViewById(R.id.progressBarWonders);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/"+
                "Taj_Mahal_%28Edited%29.jpeg/500px-Taj_Mahal_%28Edited%29.jpeg").into(imageViewTajMahal, new Callback() {
            @Override
            public void onSuccess() {
                progressBarTajMahal.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarTajMahal.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
