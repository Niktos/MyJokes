package com.example.myjokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class OfficeActivity extends AppCompatActivity {


    private String[] office_jokes = new String[]{
            "How is Christmas like your job? You do all the work and the fat guy in the suit gets all the credit.",
            "An organization is like a tree full of monkeys, all on different limbs at different levels. The monkeys on top look down and see a tree full of smiling faces. The monkeys on the bottom look up and see nothing but assholes.",
            "A doctor reaches into his smock to get a pen to write a prescription and pulls out a rectal thermometer. \"Oh, damn it,\" he proclaims, \"Some asshole has my pen!\"",
            "Being an astronaut is funny. It's the only job where you get fired before you start work.",
            "I love pressing F5. It is so refreshing.",
            "What do you call a lawyer who doesn't know the law? A judge.",
            "What do your boss and a slinky have in common? They’re both fun to watch tumble down the stairs.",
            "What do you have when 100 lawyers are buried up to their necks in sand? Not enough sand.",
            "What do you call a bench full of white people? The NBA!",
            "Why was the lawyer skimming the Bible right before he died? He was looking for loopholes!",
            "Why won't sharks attack lawyers? Professional courtesy.",
            "Why is christmas just like the day at the office?\n" +
                    "You do all the work and the fat guy with the suit gets all the credit."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        RecyclerView recyclerView;

        Office_Adapter office_adapter;

        recyclerView = (RecyclerView) findViewById(R.id.recycler_office);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        office_adapter = new Office_Adapter(OfficeActivity.this, office_jokes);
        recyclerView.setAdapter(office_adapter);

    }
}