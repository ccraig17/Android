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

public class FragmentGhana extends Fragment {
    public static FragmentGhana newInstance(){ //this instance of the fragment will allow us to create a new instance of the fragment in the ViewAdaptor class
        return new FragmentGhana();
    }

    private ImageView imageViewGhana;
    private ProgressBar progressBarGhana;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ghana,container,false);
        imageViewGhana = view.findViewById(R.id.imageView);
        progressBarGhana = view.findViewById(R.id.progressBarLeader);

        //internet permission needed in the Manifest File
        //a Callback() is added to determine when the image has loaded or not and disable the progress bar when the image is loaded
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/"+
                "Flag_of_Ghana.svg/250px-Flag_of_Ghana.svg.png").into(imageViewGhana, new Callback() {
            @Override
            public void onSuccess(){progressBarGhana.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarGhana.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }
}
