package idv.kuma.codingdojo.tennis;

import java.util.HashMap;
import java.util.Map;

public class TennisScorer {
    Map<String, Integer> players = new HashMap();
    String winner = "";

    public void addPlayer(String playerName) {
        players.put(playerName, 0);
    }

    public int getPlayersScore(String playerName) {
        return players.get(playerName);
    }

    public void addScore(String playerName) {
        int playerScore = players.get(playerName);
        if (playerScore < 30) {
            players.put(playerName, playerScore + 15);
        } else {
            players.put(playerName, playerScore + 10);
        }

        if(players.get(playerName)>50){
            winner = playerName;
        }
    }

    public void checkDuce(){
        int totalScore = 0;
        for(int score: players.values()){
            totalScore+=score;
        }
    }

    public String checkWinner(){
        return winner;
    }
}
