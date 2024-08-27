package com.craig.informationbook.adaptor;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.craig.informationbook.ModelClass;
import com.craig.informationbook.R;
import com.craig.informationbook.activity.CountryActivity;
import com.craig.informationbook.activity.LeadersActivity;
import com.craig.informationbook.activity.MainActivity;
import com.craig.informationbook.activity.MuseumsActivity;
import com.craig.informationbook.activity.WondersActivity;

import java.util.ArrayList;

public class AdaptorClass extends RecyclerView.Adapter<AdaptorClass.CardViewHolder>{
    private ArrayList<ModelClass> modelList;
    private Context context;

    public AdaptorClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_design,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        ModelClass modelClass = modelList.get(position); //give all the objects in the ArrayList to modelClass object in order.
        holder.textViewSplash.setText(modelClass.getCategoryName());
        holder.imageViewSplash.setImageResource(context.getResources().getIdentifier(modelClass.getImageName(),"drawable",context.getPackageName())); //"drawable" = location of the folder the image is located.
        holder.cardView.setOnClickListener((v->{

            Intent intent;
            switch(position){
                case 0:
                    intent = new Intent(context, CountryActivity.class); //context = current activity (MainActivity, the Opening Page or Starting Activity).
                    context.startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(context, LeadersActivity.class);
                    context.startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(context, MuseumsActivity.class );
                    context.startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(context, WondersActivity.class );
                    context.startActivity(intent);
                    break;
                default:
                    context.startActivity(new Intent(context, MainActivity.class));
            }
        }));
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewSplash;
        private TextView textViewSplash;
        private CardView cardView;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
