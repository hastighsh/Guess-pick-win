package com.example.guess_pick_win;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest
{
    @Test
    public void addition_isCorrect()
    {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testLeaderboardWriter(){
        gameModel model = new gameModel(1,"a",5);
        model.setScore(1);
        model.setNewLeaderboardScore();
        model.setName("b");
        model.setScore(2);
        model.setNewLeaderboardScore();
        model.setName("c");
        model.setScore(3);
        model.setNewLeaderboardScore();
        model.setName("d");
        model.setScore(4);
        model.setNewLeaderboardScore();
        model.setName("e");
        model.setScore(5);
        model.setNewLeaderboardScore();
        model.setName("f");
        model.setScore(6);
        model.setNewLeaderboardScore();

        List<Player> p = model.getLeaderboard();
        System.out.println("///////////////////////////////////");
        System.out.println(p);
        System.out.println("///////////////////////////////////");
        for(Player player: model.getLeaderboard()) {
            System.out.println(player.getName());
            System.out.println(player.getScore());
            System.out.println("///");

        }
        System.out.println("///////////////////////////////////");



    }
}