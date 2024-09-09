package com.craig.informationbook.fragments.Leaders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.craig.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class FragmentAkufo extends Fragment {
    public static FragmentAkufo newInstance(){
        return new FragmentAkufo();
    }
    private CircleImageView imageViewAkufo;
    private ProgressBar progressBarAkufo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_akufoaddo, container, false);
        imageViewAkufo = view.findViewById(R.id.imageViewLeader);
        progressBarAkufo = view.findViewById(R.id.progressBarLeader);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/"+
                "Nana_Akufo_Addo%2C_Jan._2020.jpg/220px-Nana_Akufo_Addo%2C_Jan._2020.jpg").into(imageViewAkufo, new Callback() {
            @Override
            public void onSuccess() {
                progressBarAkufo.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarAkufo.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
