package com.example.myjokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StandUpActivity extends AppCompatActivity {


    private String[] StandUp_jokes = new String[]{

            "I have as much authority as the Pope, I just don't have as many people who believe it.",
            "Atheism is a non-prophet organization.",
            "I was thinking about how people seem to read the Bible a whole lot more as they get older; then it dawned on me - they're cramming for their final exam.",
            "Black people dominate sports in the United States. 20% of the population and 90% of the final four.",
            "Don't argue! You cannot win, you cannot beat a woman in a argument. It's impossible you will not win. Cause men, we are handicapped when it comes to arguing cause we have a need to make sense",
            "Gay people got a right to be as miserable as everybody else.",
            "That's my idol, Elvis Presley. If you went to my house, you`d see pictures all over of Elvis. He's just the greatest entertainer that ever lived. And I think it's because he had such presence. When Elvis walked into a room, Elvis Presley was in the fucking room. I don't give a fuck who was in the room with him, Bogart, Marilyn Monroe.",
            "Alright, listen up! I don't like white people. I hate rednecks. You people are rednecks. That means I'm enjoyin' this shit.",
            "Bear and a rabbit were taking a shit in the woods. And the bear turns to the rabbit and says, \"Excuse me, do you have problems with shit sticking to your fur?\" And the rabbit says, \"No.\" So the bear wiped his ass with the rabbit.",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_up);


        RecyclerView recyclerView;


        StandUp_Adapter standUp_adapter;


        recyclerView = (RecyclerView) findViewById(R.id.recycler_stand_up);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        standUp_adapter = new StandUp_Adapter(StandUpActivity.this, StandUp_jokes);
        recyclerView.setAdapter(standUp_adapter);
    }
}