package com.craig.informationbook.fragments.Countries;

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

public class FragmentJapan extends Fragment {
    public static FragmentJapan newInstance(){ //this instance of the fragment will allow us to create a new instance of the fragment in the ViewAdaptor class
        return new FragmentJapan();
    }

    private ImageView imageViewJapan;
    private ProgressBar progressBarJapan;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_japan,container,false);
        imageViewJapan = view.findViewById(R.id.imageView);
        progressBarJapan = view.findViewById(R.id.progressBarLeader);

        //internet permission needed in the Manifest File
        //a Callback() is added to determine when the image has loaded or not and disable the progress bar when the image is loaded
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/"+
                "Flag_of_Japan.svg/250px-Flag_of_Japan.svg.png").into(imageViewJapan, new Callback() {
            @Override
            public void onSuccess() {
                progressBarJapan.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarJapan.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }
}
