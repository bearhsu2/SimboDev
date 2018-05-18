package idv.kuma.codingdojo.tennis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisScorerTest {

    private String PLAYER_1 = "player1";
    private String PLAYER_2 = "player2";
    TennisScorer tennisScorer;
    @After
    public void tearDown() throws Exception {
        
    }

    @Before
    public void setUp() throws Exception {
        tennisScorer = new TennisScorer();
        tennisScorer.addPlayer(PLAYER_1);
        tennisScorer.addPlayer(PLAYER_2);
    }

    @Test
    public void AtBeginning_AllZeros() throws Exception {
        Assert.assertEquals(tennisScorer.getPlayersScore(PLAYER_1),0 );
        Assert.assertEquals(tennisScorer.getPlayersScore(PLAYER_2),0 );
    }

    @Test
    public void TestPlayerScoreSuccess() throws Exception {
        tennisScorer.addScore(PLAYER_1);
        Assert.assertEquals(15, tennisScorer.getPlayersScore(PLAYER_1));
    }

    @Test
    public void TestPlayerScoreThird() throws Exception {
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        Assert.assertEquals(40, tennisScorer.getPlayersScore(PLAYER_1));
    }
    @Test
    public void TestOnePlayerWin(){
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        Assert.assertEquals(PLAYER_1, tennisScorer.checkWinner());
    }

    @Test
    public void TestPlayersDeuce() throws Exception{
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_2);
        Assert.assertEquals(0, tennisScorer.getPlayersScore(PLAYER_1)-tennisScorer.getPlayersScore(PLAYER_2));
    }

    @Test
    public void TestPlayer1Advance() {
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_1);

        Assert.assertEquals(50, tennisScorer.getPlayersScore(PLAYER_1));
    }

    @Test
    public void TestPlayer1AdvanceThenWin() {
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_2);
        tennisScorer.addScore(PLAYER_1);
        tennisScorer.addScore(PLAYER_1);

        Assert.assertEquals(PLAYER_1, tennisScorer.checkWinner());
    }
}