package com.example.guess_pick_win;

public class Player implements Comparable<Player> {

    private String name;
    private int score;

    public Player(String name, int score){
        this.name=name;
        this.score=score;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }


    public int getScore(){
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;
        Player other = (Player) object;
        if (this.name == null) {
            if (other.name != null) return false;
        } else if (!this.name.equalsIgnoreCase(other.name)) return false;
        return this.score == other.score;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.score, o.score);
    }

    @Override
    public String toString(){
        return "("+this.name+this.score+")";
    }
}
