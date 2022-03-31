package com.example.guess_pick_win;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public void openGameScreen(){
        Intent intent = new Intent(this, gameScreen.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button easyButton = (Button) findViewById(R.id.easylvl);
        Button mediumButton = (Button) findViewById(R.id.mediumlvl);
        Button hardButton = (Button) findViewById(R.id.hardlvl);

        easyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //what is max???
                int max = 0;
                EditText playerName = (EditText) findViewById(R.id.nameBox);
                String name = playerName.getText().toString();
                openGameScreen();
                gameModel diff = new gameModel(1, name, max);
            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //what is max????
                int max = 0;
                EditText playerName = (EditText) findViewById(R.id.nameBox);
                String name = playerName.getText().toString();
                openGameScreen();
                gameModel diff = new gameModel(2, name, max);
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //what is max???
                int max = 0;
                EditText playerName = (EditText) findViewById(R.id.nameBox);
                String name = playerName.getText().toString();
                openGameScreen();
                gameModel diff = new gameModel(3, name, max);
            }
        });
    }



}