package com.example.myjokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MedicalActivity extends AppCompatActivity {

    private String[] medical_jokes = new String[]{

            "I told the doctor I didn’t want a brain surgery. But he changed my mind.", "Woman: Doctor, where are we going? Doctor: To the morgue. Woman: I’m not dead yet, doctor. Doctor: We’re not at morgue yet, either",
            "I asked the doctor doing my prostate exam where i should put my pants. “next to mine” was not the answer i was expecting", "My doctor called me fat. I told him I wanted a second opinion and he said, “OK, you’re ugly too.”",
            "I’m a family doctor and I wish I could help but… you’re an orphan", "My family loves to have dance parties. My dad will just play music from his iPod, and I’ll go to the light switch and make a nice strobe light effect. Everyone loves it, especially my younger cousin. He gets down on the floor and starts breakdancing! It makes him so happy, and he needs that extra joy in his life, especially since the doctor recently diagnosed him with epilepsy.",
            "My ex got into a bad accident recently. I told the doctors the wrong blood type. Now she will really know what rejection feels like",
            "So theres a orphan in a hospital and the doctor walks up and says “sorry kid but this is a family hospital”",
            "A woman visits the doctor as she has some abdominal pains and suspects she may be pregnant. After her examination, the doctor comes out to see her: “Well, I hope you like changing diapers!” She replies: “Oh my god! Am I pregnant, am I pregnant!?” To which he responds: “No, you’ve got bowel cancer.”",
            "Why did the library book go to the doctor? – It needed to be checked out.",
            "My doctor told me that I had to burn calories, so I took a fat kid and lit them on fire",
            "I am still trying to figure out why paying the covid doctors a complement is so offensive. They even kicked me out and all I said was to stay positive…"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);


        RecyclerView recyclerView;

        Medical_Adapter medical_adapter;

        recyclerView = (RecyclerView) findViewById(R.id.recycler_medical);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        medical_adapter = new Medical_Adapter(MedicalActivity.this, medical_jokes);
        recyclerView.setAdapter(medical_adapter);
    }
}