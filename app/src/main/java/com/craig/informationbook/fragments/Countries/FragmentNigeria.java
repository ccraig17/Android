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

public class FragmentNigeria extends Fragment {
    public static FragmentNigeria newInstance(){ //this instance of the fragment will allow us to create a new instance of the fragment in the ViewAdaptor class
        return new FragmentNigeria();
    }

    private ImageView imageViewNigeriaFlag;
    private ProgressBar progressBarNigeria;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nigeria,container,false);
        imageViewNigeriaFlag = view.findViewById(R.id.imageView);
        progressBarNigeria = view.findViewById(R.id.progressBarLeader);

        //internet permission needed in the Manifest File
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/" +
                "Flag_of_Nigeria.svg/260px-Flag_of_Nigeria.svg.png").into(imageViewNigeriaFlag, new Callback() {
            @Override
            public void onSuccess() {
                progressBarNigeria.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarNigeria.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }
}
