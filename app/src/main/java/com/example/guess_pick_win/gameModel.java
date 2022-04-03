package com.example.guess_pick_win;

import java.util.*;

// the model of the project
public class gameModel {
    private String name;
    private int score, difficulty;
    private static int number;
    private final HashSet<Player> leaderboardList;
    //private int[] pastGuesses;

    /*
     accepts an integer between 1-3.
     1=easy, 2=medium, 3=hard
     */
    public gameModel(){
        this.difficulty= 0;
        this.name = "";
        this.score = 0;
        this.leaderboardList = new HashSet<>();

    }

    public gameModel(int difficulty,String name){
        this.difficulty=difficulty;
        this.name=name;
        this.score=0;
        this.leaderboardList = new HashSet<>();

        //pastGuesses=new int[0];
    }


    public void setDifficulty(int newDifficulty){

        if (newDifficulty>=1&&newDifficulty<=3){
            this.difficulty=newDifficulty;
        }
        else{
            throw new IllegalArgumentException();
        }

    }


    public void setName(String name){
        this.name=name;
    }

    public String setNumber(){
        RandomNumberGenerator rnd = new RandomNumberGenerator();
        this.number=rnd.makeRandomNumber();
        return null;
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

    public int getNumber(){
        return this.number;
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

    /*//for test only
    public void setScore(int score) {
        this.score = score;
    }
    *//////

}
