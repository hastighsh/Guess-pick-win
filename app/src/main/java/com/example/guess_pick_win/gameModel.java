package com.example.guess_pick_win;

// the model of the project
public class gameModel {
    private String name;
    private int score, difficulty, lifeLeft, max, number;
    private String[] leaderboardNames;
    private int[] leaderboardScores, pastGuesses;

    /*
     accepts an integer between 1-3.
     1=easy, 2=medium, 3=hard
     */
    public gameModel(int difficulty,String name,int max){
        this.difficulty=difficulty;
        this.name=name;
        this.max=max;
        this.score=0;
        //pastGuesses=new int[0];


        if (difficulty==1){
            this.lifeLeft=3;
        }

        else if (difficulty==2){
            this.lifeLeft=2;
        }

        else if (difficulty==3){
            this.lifeLeft=1;
        }
        else{
            throw new IllegalArgumentException();
        }

    }


    public void setDifficulty(int newDifficulty){

        if (newDifficulty>=1&&newDifficulty<=3){
            this.lifeLeft+=this.difficulty-newDifficulty;
            this.difficulty=newDifficulty;
        }
        else{
            throw new IllegalArgumentException();
        }

    }

    public void setMax(int newMax){
        this.max=newMax;
    }

    public void setName(String name){
        this.name=name;
    }




    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public int getDifficulty(){
        return this.difficulty;
    }

    public int getLifeLeft(){
        return this.lifeLeft;
    }

    public int getMax(){
        return this.max;
    }

}
