package com.example.myjokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class Welcome extends AppCompatActivity {


    Button buttonAnimal;
    Button buttonFood;
    Button buttonOffice;
    Button buttonMedical;
    Button buttonStandUp;

    private int[] mImages = new int[]{
            R.drawable.cat, R.drawable.leopard, R.drawable.monkey, R.drawable.rakoon, R.drawable.sheep
    };


    private int[] mImages1 = new int[]{
            R.drawable.hamburger, R.drawable.pizza, R.drawable.sushi, R.drawable.soup, R.drawable.meat
    };


    private int[] mImages2 = new int[]{
            R.drawable.office, R.drawable.office_serial, R.drawable.steve_carell, R.drawable.smile, R.drawable.building
    };


    private int[] mImages3 = new int[]{
            R.drawable.medical_coronavirus, R.drawable.medical_device, R.drawable.medical_doctors, R.drawable.medical_first_aid, R.drawable.medical_pils
    };


    private int[] mImages4 = new int[]{
            R.drawable.stand_up_carlin, R.drawable.stand_up_criss, R.drawable.stand_up_lui, R.drawable.standu_up_joker, R.drawable.stund_up_eddie
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        buttonAnimal = findViewById(R.id.button_animal);

        CarouselView carouselView1 = findViewById(R.id.carousel2);
        carouselView1.setPageCount(mImages1.length);
        carouselView1.setImageListener(new ImageListener() {

            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages1[position]);
            }
        });
        carouselView1.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {

            }
        });

        buttonFood = findViewById(R.id.button_food);

        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {

            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {

            }
        });

        buttonOffice = findViewById(R.id.button_office);

        CarouselView carouselView3 = findViewById(R.id.carousel3);
        carouselView3.setPageCount(mImages2.length);
        carouselView3.setImageListener(new ImageListener() {

            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages2[position]);
            }
        });
        carouselView3.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {

            }
        });

        buttonMedical = findViewById(R.id.button_medical);

        CarouselView carouselView4 = findViewById(R.id.carousel4);
        carouselView4.setPageCount(mImages3.length);
        carouselView4.setImageListener(new ImageListener() {

            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages3[position]);
            }
        });
        carouselView4.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {

            }
        });

        buttonStandUp = findViewById(R.id.button_stand_up);

        CarouselView carouselView5 = findViewById(R.id.carousel5);
        carouselView5.setPageCount(mImages4.length);
        carouselView5.setImageListener(new ImageListener() {

            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages4[position]);
            }
        });
        carouselView5.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {

            }
        });

        buttonAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentAnimal = new Intent(Welcome.this, AnimalActivity.class);
                startActivity(intentAnimal);
            }
        });


        buttonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentFood = new Intent(Welcome.this, FoodActivity.class);
                startActivity(intentFood);
            }
        });


        buttonOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOffice = new Intent(Welcome.this, OfficeActivity.class);
                startActivity(intentOffice);
            }
        });

        buttonMedical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMedical = new Intent(Welcome.this, MedicalActivity.class);
                startActivity(intentMedical);
            }
        });

        buttonStandUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStandUp = new Intent(Welcome.this, StandUpActivity.class);
                startActivity(intentStandUp);
            }
        });

    }
}





