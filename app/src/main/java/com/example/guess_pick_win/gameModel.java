package com.example.guess_pick_win;

import java.io.*;
import java.util.*;

// the model of the project
public class gameModel {
    private String name;
    private int score, difficulty, lifeLeft, max, number;
    private final HashSet<Player> leaderboardList;
    private int[] pastGuesses;

    /*
     accepts an integer between 1-3.
     1=easy, 2=medium, 3=hard
     */
    public gameModel(){
        this.difficulty= 0;
        this.name = "";
        this.max = 0;
        this.score = 0;
        this.leaderboardList = new HashSet<>();
    }

    public gameModel(int difficulty,String name,int max){
        this.difficulty=difficulty;
        this.name=name;
        this.max=max;
        this.score=0;
        this.leaderboardList = new HashSet<>();
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



    public void setNewLeaderboardScore(){
        this.leaderboardList.add(new Player(this.name,this.score));
    }

    public List<Player> getLeaderboard(){
        List<Player> leaderboard = new ArrayList<>();
        leaderboard.addAll(this.leaderboardList);
        Collections.sort(leaderboard);
        Collections.reverse(leaderboard);
        return leaderboard;
    }
    public Player getLeaderboard(int position){
        List<Player> leaderboard = new ArrayList<>();
        leaderboard.addAll(this.leaderboardList);
        Collections.sort(leaderboard);
        Collections.reverse(leaderboard);
        return leaderboard.get(position);

    }

    //for test only
    public void setScore(int score) {
        this.score = score;
    }
    //////

}
