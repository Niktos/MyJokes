package com.example.myjokes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalActivity extends AppCompatActivity {


    private String[] animal_jokes = new String[]{"What to rabbits eat for breakfast? IHOP.", "What happens to a toad's car when it breaks down? It gets toad away.",
            "What steps do you take if you a tiger is running towards you? Big ones!", "What was the first animal in space? The cow that jumped over the moon.",
            "What's the most musical part of a chicken? The drumstick!",
            "Knock, knock. Who's there? Kanga. Kanga who? No, Kanga-roo!", "What do you call a parrot when it has dried itself after a bath? Polly unsaturated!",
            "What do ducks watch on TV? Duck-umentaries!", "Why are elephants never rich? Because they work for peanuts!",
            "What do you get when you cross a hammock and a dog? A rocker spaniel!", "Which kinds of snakes are found on cars? Windshield vipers!", "What do you call a cow in an earthquake? A milkshake!",
            "What is a dog's favorite city? New Yorkie!", "What's a frog's favorite soda? Croak-a-Cola!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        RecyclerView recyclerView;


        Animal_Adapter animal_adapter;


        recyclerView = (RecyclerView) findViewById(R.id.recycler_animal);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        animal_adapter = new Animal_Adapter(AnimalActivity.this, animal_jokes);
        recyclerView.setAdapter(animal_adapter);

    }
}
