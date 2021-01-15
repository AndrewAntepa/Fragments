package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button first, second, third, fourth;
    FragmentManager fragmentManager;
    FirstPage firstPage;
    SecondPage secondPage;
    ThirdPage thirdPage;
    FourthPage fourthPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.first_page);
        second = findViewById(R.id.second_page);
        third = findViewById(R.id.third_page);
        fourth = findViewById(R.id.fourth_page);

        fragmentManager = getSupportFragmentManager();
        firstPage = new FirstPage();
        secondPage = new SecondPage();
        thirdPage = new ThirdPage();
        fourthPage = new FourthPage();

        if (savedInstanceState == null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, firstPage);
            fragmentTransaction.commit();
        }

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container, firstPage);
                fragmentTransaction.commit();
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container, secondPage);
                fragmentTransaction.commit();
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container, thirdPage);
                fragmentTransaction.commit();
            }
        });

        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.container, fourthPage);
                fragmentTransaction.commit();
            }
        });
    }
}