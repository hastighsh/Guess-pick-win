package com.example.guess_pick_win;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class gameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
    }

    public void popupMenu(View view) {
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View popupMenu = inflater.inflate(R.layout.menu_popup, null);

        //create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; //lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupMenu, width, height, focusable);

        //show the popup menu window
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        //dismiss the popup menu when clicking on cancel button
        Button close = (Button) popupMenu.findViewById(R.id.cancelbtn);
        close.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                popupWindow.dismiss();
            }
        });

    }
}