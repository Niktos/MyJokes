package com.example.myjokes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Animal_Adapter extends RecyclerView.Adapter<Animal_Adapter.ViewHolder> {


    String[] items_animals;
    private Context mContext;


    public Animal_Adapter(AnimalActivity animalactivity, String[] animal_jokes) {
        mContext = animalactivity;
        items_animals = animal_jokes;

    }



    @Override
    public Animal_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        Animal_Adapter.ViewHolder vh = new Animal_Adapter.ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(Animal_Adapter.ViewHolder holder, final int position) {
        holder.item_textView.setText("" + items_animals[position]);


        holder.item_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareAnimal = items_animals[position];

                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareAnimal);
                mContext.startActivity(Intent.createChooser(sharingIntent, "Send to "));
            }
        });



    }

    @Override
    public int getItemCount() {
        return items_animals.length;
    }




    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView item_textView;
        Button item_button;
        RelativeLayout relativeLayout;


        public ViewHolder(View itemView) {
            super(itemView);

            item_textView = (TextView) itemView.findViewById(R.id.item_txt);
            item_button = (Button) itemView.findViewById(R.id.share_button);
            item_button.setOnClickListener(this);

            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.item_layout);


        }


        @Override
        public void onClick(View v) {

        }
    }

}