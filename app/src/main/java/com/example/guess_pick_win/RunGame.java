package com.example.guess_pick_win;

public class RunGame {
    private int score;
    private int highScore;

    public  String compareAnswer(int ranNum, int inputNum){
        String result ="";

        if( ranNum == inputNum){
            result = "Congratulations!! Your guess is correct, Well Done!";
            this.score++;
        }
        else{
            result = "OOPS!! You lost :( Try again";
            this.score = 0;
        }

        return result;
    }

    public int getScore(){
        return this.score;
    }

    public void compareScore(){

//        //if(this.score > Player.getScore()){
//            this.highScore = this.score;
//        }

    }
}

