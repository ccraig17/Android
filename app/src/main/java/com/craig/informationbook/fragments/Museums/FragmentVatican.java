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

public class FragmentVatican extends Fragment {
    public static FragmentVatican newFragment(){
        return new FragmentVatican();
    }
    public ImageView imageVatican;
    public ProgressBar progressBarVatican;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vatican_museum, container, false);
        imageVatican = view.findViewById(R.id.imageViewMuseum);
        progressBarVatican = view.findViewById(R.id.progressBarMuseum);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/"+
        "Musei_Vaticani._Braccio_Nuovo.JPG/480px-Musei_Vaticani._Braccio_Nuovo.JPG").into(imageVatican, new Callback() {
            @Override
            public void onSuccess() {
                progressBarVatican.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarVatican.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
