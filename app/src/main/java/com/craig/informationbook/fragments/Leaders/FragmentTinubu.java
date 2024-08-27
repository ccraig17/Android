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
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentTinubu extends Fragment {
   public static FragmentTinubu newInstance(){
       return new FragmentTinubu();
   }
    private ShapeableImageView imageViewTinubu;
    private ProgressBar progressBarTinubu;

    @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_tinubu, container, false);
         imageViewTinubu =  view.findViewById(R.id.imageViewTinubu);
         progressBarTinubu = view.findViewById(R.id.progressBarTinubu);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/"+
                "Bola_Tinubu_portrait.jpg/220px-Bola_Tinubu_portrait.jpg").into(imageViewTinubu, new Callback() {
            @Override
            public void onSuccess() {
                progressBarTinubu.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBarTinubu.setVisibility(View.VISIBLE);
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
