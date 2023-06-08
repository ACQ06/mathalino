package com.example.math_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    String username="";

    int intentCheck, lvl, score;

    CardView lvl1, lvl2, lvl3;

    Intent intent;
    Handler handle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        handle = new Handler();

        intent = getIntent();
        username = intent.getStringExtra("username");
        intentCheck = intent.getIntExtra("intent",0);
        if(intentCheck == 1){
            lvl = intent.getIntExtra("lvl",0);
            score = intent.getIntExtra("score",0);
        }

        TextView hpUser = findViewById(R.id.homepageUser);
        hpUser.setText(username);

        lvl1 = findViewById(R.id.cardViewLvl1);
        lvl1.setOnClickListener(v ->{
            intent = new Intent(HomePage.this, GameActivity.class);
            intent.putExtra("lvl",1);
            intent.putExtra("username",username);
            startActivity(intent);
            handle.postDelayed(this::finish, 0);
        });

        lvl2 = findViewById(R.id.cardViewLvl2);
        lvl2.setOnClickListener(v ->{
            intent = new Intent(HomePage.this, GameActivity.class);
            intent.putExtra("lvl",2);
            intent.putExtra("username",username);
            startActivity(intent);
            handle.postDelayed(this::finish, 0);
        });

        lvl3 = findViewById(R.id.cardViewLvl3);
        lvl3.setOnClickListener(v ->{
            intent = new Intent(HomePage.this, GameActivity.class);
            intent.putExtra("lvl",3);
            intent.putExtra("username",username);
            startActivity(intent);
            handle.postDelayed(this::finish, 0);
        });

    }
}