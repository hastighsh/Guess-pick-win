package com.example.guess_pick_win;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class gameScreen extends AppCompatActivity {


    public void openMenuPopup() {
        Intent a = new Intent(this, MenuPopup.class);
        startActivity(a);
    }

    public void openHintPopup() {
//        int ranNum = RandomNumberGenerator.ranNum;
        Intent b = new Intent(this, HintPopup.class);
        Intent intent = getIntent();
        Integer number = intent.getIntExtra("number", 120);
        b.putExtra("number", number);
        startActivity(b);
    }

    public void openAnnouncementPopup(Integer guess) {
        Intent c = new Intent(this, AnnouncementPopup.class);
        c.putExtra("guessNumber", guess);
        Intent intent = getIntent();
        Integer number = intent.getIntExtra("number", 120);
        c.putExtra("number", number);
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
                EditText guessNumText = (EditText) findViewById(R.id.inputA);
                Integer guessNumber = Integer.valueOf(guessNumText.getText().toString());
                Log.i("gameScreen", "guess num is "+guessNumber);

                openAnnouncementPopup(guessNumber);
            }
        });

    }

}