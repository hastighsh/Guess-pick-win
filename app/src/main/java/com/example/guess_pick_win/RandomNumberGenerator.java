package com.example.guess_pick_win;

public class RandomNumberGenerator
{

    public int ranNum;



    public RandomNumberGenerator(){
        ranNum = 0;
    }

    /*generating random number based on the selected difficulty level
    easy lvl -> 1 to 5
    medium lvl -> 1 to 10
    hard lvl -> 1 to 15
    */
    public int makeRandomNumber(int difficulty){
        if (difficulty == 1){

            int min = 1, max = 5;
            ranNum = min + (int)(Math.random() * (max - min + 1));
            return ranNum;

        } else if (difficulty == 2) {

            int min = 1, max = 10;
            ranNum = min + (int)(Math.random() * (max - min + 1));
            return ranNum;

        } else if (difficulty == 3) {

            int min = 1, max = 20;
            ranNum = min + (int)(Math.random() * (max - min + 1));
            return ranNum;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getRanNum()
    {
        return this.ranNum;
    }
}
