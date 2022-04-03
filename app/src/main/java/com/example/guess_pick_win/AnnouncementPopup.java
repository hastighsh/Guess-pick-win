package com.example.guess_pick_win;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnnouncementPopup extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.announcement_popup);

        //finding value by public static variable
        TextView testView = findViewById(R.id.annoBox);
        RunGame run = new RunGame();
        Intent intent = getIntent();
        Integer number = intent.getIntExtra("number", 120);
        Integer guess = intent.getIntExtra("guessNumber", 120);

        String result = run.compareAnswer(number, guess);
        testView.setText(result);
        Button okBtn = (Button) findViewById(R.id.okBtn);
        okBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
    }
}
