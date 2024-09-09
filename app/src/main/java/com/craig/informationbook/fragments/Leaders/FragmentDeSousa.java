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

public class FragmentDeSousa extends Fragment {
    public static FragmentDeSousa newInstance(){
        return new FragmentDeSousa();
    }
    private CircleImageView imageViewDeSousa;
    private ProgressBar progressBarDeSousa;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_desousa, container, false);
        imageViewDeSousa = view.findViewById(R.id.imageViewLeader);
        progressBarDeSousa = view.findViewById(R.id.progressBarLeader);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/"+
                "Marcelo_Rebelo_de_Sousa_%28Bicenten%C3%A1rio_da_Independ%C3%AAncia_do_Brasil%29.jpg/220px-Marcelo_Rebelo_de_Sousa_%28Bicenten%C3%A1rio_da_Independ%C3%AAncia_do_Brasil%29.jpg").into(imageViewDeSousa, new Callback() {
            @Override
            public void onSuccess() {
                progressBarDeSousa.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarDeSousa.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
