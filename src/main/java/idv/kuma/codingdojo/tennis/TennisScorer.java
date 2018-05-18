package idv.kuma.codingdojo.tennis;

public class TennisScorer {
    private int player1ScoreIndex = 0;
    private int player2ScoreIndex = 0;

    private int[] scoreList = {0, 15, 30, 40, 41, 99};

    public int receivePlayerScore(int playerId) {

        if(playerId == 1)
            return this.scoreList[this.player1ScoreIndex];
        else
            return this.scoreList[this.player2ScoreIndex];
    }

    // Player1
    public void player1WinOneBall(){

        if(this.player1ScoreIndex == 3 && this.player2ScoreIndex == 3){
            this.player1ScoreIndex++;
        }

        this.player1ScoreIndex++;
    }

    // Player2
    public void player2WinOneBall() {
        this.player2ScoreIndex++;
    }
}
