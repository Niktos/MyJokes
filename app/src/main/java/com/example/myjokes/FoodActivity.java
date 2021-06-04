package com.example.myjokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FoodActivity extends AppCompatActivity {


    private String[] food_jokes = new String[]{
            "My friend thinks he is smart. He told me an onion is the only food that makes you cry, so I threw a coconut at his face.",
            "Why do hamburgers go to the gym? To get better buns!", "Yo mama so fat the bears have to hide their food from her when she goes camping.",
            "Your Halloween costume came in the mail today. I opened it. It was a rooster mask and a bag of lollipops. Going as a c*ck sucker again!?",
            "Scientists have discovered a food that diminishes a woman's sex drive by 90%. It's called a wedding cake.", "Yo momma so fat her favorite food is seconds.",
            "You've got your head so far up your ass you can chew your food twice.", "A lot of people cry when they cut an onion. The trick is not to form an emotional bond.",
            "Give a man a fish and he will eat for a day. Teach him how to fish and he will sit in a boat and drink beer all day.", "If tomatoes are a fruit, isn't ketchup a smoothie?",
            "Have you heard the story of the magic sandwich? Never mind, it's just a bunch of bologna.", "I just bought a cured ham, I wonder what it had.", "Yo momma is so stupid she ate her food stamps.",
            "I told my wife I was going to make a bike out of spaghetti. She couldn't believe it when I rode pasta."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        RecyclerView recyclerView;

        Food_Adapter food_adapter;


        recyclerView = (RecyclerView) findViewById(R.id.recycler_food);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        food_adapter = new Food_Adapter(FoodActivity.this, food_jokes);
        recyclerView.setAdapter(food_adapter);
    }
}