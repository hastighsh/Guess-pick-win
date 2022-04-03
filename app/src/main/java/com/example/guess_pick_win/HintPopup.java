package com.example.guess_pick_win;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class HintPopup extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hint_popup);

        TextView testView = findViewById(R.id.hintBox);
        //gameModel g = new gameModel();
        //int num = new RandomNumberGenerator().makeRandomNumber();
        String result = Hint.hint(RandomNumberGenerator.ranNum);
        testView.setText(result);


        //Hasti----------
//        gameModel ranNum = new gameModel();
//        String result = Hint.hint(ranNum.setNumber());
//
//        TextView testView = findViewById(R.id.hintBox);
//        testView.setText(result);
        //Hasti----------

        //saba-----------
//        String num = getIntent().getStringExtra("num"); // saba
//        String result = Hint.hint(num);// saba
//
//        TextView testView = findViewById(R.id.hintBox); //saba
//        testView.setText(result);// saba
        //saba------------


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
