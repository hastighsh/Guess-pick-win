package com.example.guess_pick_win;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class gameScreen extends AppCompatActivity {


    public void openMenuPopup() {
        Intent a = new Intent(this, MenuPopup.class);
        startActivity(a);
    }

    public void openHintPopup() {
        Intent b = new Intent(this, HintPopup.class);


       b.putExtra("num", 10);// saba
        startActivity(b);
    }

    public void openAnnouncementPopup() {
        Intent c = new Intent(this, AnnouncementPopup.class);
        startActivity(c);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        Button menuBtn = (Button) findViewById(R.id.mainMenubtn);
        Button hintBtn = (Button) findViewById(R.id.hintbtn);
        Button guessBtn = (Button) findViewById(R.id.guessbtn);

        menuBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openMenuPopup();            }
        });

        hintBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openHintPopup();
            }
        });

        guessBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openAnnouncementPopup();
            }
        });

    }

}