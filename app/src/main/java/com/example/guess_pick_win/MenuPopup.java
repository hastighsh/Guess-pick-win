package com.example.guess_pick_win;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MenuPopup extends AppCompatActivity
{

    public void openMainMenu() {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

    public void openGameScreen(){
        Intent intent = new Intent(this, gameScreen.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_popup);

        Button xBtn = (Button) findViewById(R.id.cancelbtn);
        Button mainMenuBtn = (Button) findViewById(R.id.mainMenubtn);
        Button easyButton = (Button) findViewById(R.id.easylvl);
        Button mediumButton = (Button) findViewById(R.id.mediumlvl);
        Button hardButton = (Button) findViewById(R.id.hardlvl);


        xBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

        mainMenuBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openMainMenu();
            }
        });
        easyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openGameScreen();
            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openGameScreen();
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openGameScreen();
            }
        });


    }
}
