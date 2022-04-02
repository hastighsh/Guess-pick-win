package com.example.guess_pick_win;

import java.util.Random;

public class Hint {

    public static String hint (String num){
        String result = "";
     if (Integer.parseInt(num) % 2 == 0) {
        result = "The preferred number is even.";
    }
        else {
        result= "The preferred number is odd.";
    }
        return result;
    }
}
