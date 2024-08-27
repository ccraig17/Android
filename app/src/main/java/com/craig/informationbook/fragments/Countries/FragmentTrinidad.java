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

public class FragmentTrinidad extends Fragment {
    public static FragmentTrinidad newInstance(){ //this instance of the fragment will allow us to create a new instance of the fragment in the ViewAdaptor class
        return new FragmentTrinidad();
    }

    private ImageView imageViewTrinidadFlag;
    private ProgressBar progressBarTrinidad;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trinidadtobago,container,false);
        imageViewTrinidadFlag = view.findViewById(R.id.imageView);
        progressBarTrinidad = view.findViewById(R.id.progressBarLeader);

        //internet permission needed in the Manifest File
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/"+
                "Flag_of_Trinidad_and_Tobago.svg/250px-Flag_of_Trinidad_and_Tobago.svg.png").into(imageViewTrinidadFlag, new Callback() {
            @Override
            public void onSuccess() {
                progressBarTrinidad.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarTrinidad.setVisibility(View.INVISIBLE);
            }
        });
        return view;
    }
}
