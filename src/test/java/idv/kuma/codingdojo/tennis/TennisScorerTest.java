package idv.kuma.codingdojo.tennis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisScorerTest {
    TennisScorer ts = null;

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        ts = new TennisScorer();
    }

    @Test
    public void AtBeginning_AllZeros() throws Exception {
        int player1Score = ts.receivePlayerScore(1);
        int player2Score = ts.receivePlayerScore(2);

        Assert.assertEquals(0, player1Score);
        Assert.assertEquals(0, player2Score);
    }

    @Test
    public void isDeuce(){
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        ts.player1WinOneBall();

        ts.player2WinOneBall();
        ts.player2WinOneBall();
        ts.player2WinOneBall();
        ts.player2WinOneBall();

        int player1Score = ts.receivePlayerScore(1);
        int player2Score = ts.receivePlayerScore(2);
        Assert.assertEquals(player1Score, player2Score);
    }

    @Test
    public void WhenPlayer1WinOneBall_ThenPlayer1ScoreIs15(){
        ts.player1WinOneBall();
        int player1Score = ts.receivePlayerScore(1);
        Assert.assertEquals(15, player1Score);
    }

    @Test
    public void WhenPlayer1WinTwoBall_ThenPlayer1ScoreIs30(){
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        int player1Score = ts.receivePlayerScore(1);
        Assert.assertEquals(30, player1Score);
    }

    @Test
    public void WhenPlayer1WinThreeBall_ThenPlayer1ScoreIs40(){
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        int player1Score = ts.receivePlayerScore(1);
        Assert.assertEquals(40, player1Score);
    }

    @Test
    public void WhenPlayer2WinOneBall_ThenPlayer2ScoreIs15(){
        ts.player2WinOneBall();
        int player2Score = ts.receivePlayerScore(2);
        Assert.assertEquals(15, player2Score);
    }

    @Test
    public void WhenPlayer2WinTwoBall_ThenPlayer2ScoreIs30(){
        ts.player2WinOneBall();
        ts.player2WinOneBall();
        int player2Score = ts.receivePlayerScore(2);
        Assert.assertEquals(30, player2Score);
    }

    @Test
    public void WhenPlayer2WinThreeBall_ThenPlayer2ScoreIs40(){
        ts.player2WinOneBall();
        ts.player2WinOneBall();
        ts.player2WinOneBall();
        int player2Score = ts.receivePlayerScore(2);
        Assert.assertEquals(40, player2Score);
    }

    @Test
    public void WhenPlayer1ReachScore99_ThenPlayer1Win(){
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        ts.player1WinOneBall();
        ts.player1WinOneBall();



        int player1Score = ts.receivePlayerScore(1);
        Assert.assertEquals(99, player1Score);
    }

    @Test
    public void WhenPlayer2ReachScore99_ThenPlayer2Win(){
        ts.player2WinOneBall();
        ts.player2WinOneBall();
        ts.player2WinOneBall();
        ts.player2WinOneBall();


        int player1Score = ts.receivePlayerScore(2);
        Assert.assertEquals(99, player1Score);
    }

}