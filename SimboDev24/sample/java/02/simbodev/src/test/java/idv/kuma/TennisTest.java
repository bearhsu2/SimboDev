package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TennisTest {

    private final Tennis tennis;

    public TennisTest() {
        tennis = new Tennis("Kuma","Tom");
    }

    @Test
    public void When_0_0_Then_Love_All() {
        Assert.assertEquals("Love All", tennis.score());
    }


    @Test
    public void When_1_0_Then_Fifteen_Love() {
        aScores(1);
        Assert.assertEquals("Fifteen Love", tennis.score());


    }


    @Test
    public void When_2_0_Then_Thirty_Love() {
        aScores(2);
        Assert.assertEquals("Thirty Love", tennis.score());
    }

    @Test
    public void When_3_0_Then_Forty_Love() {
        aScores(3);
        Assert.assertEquals("Forty Love", tennis.score());
    }


    @Test
    public void When_0_1_Then_Love_Fifteen() {
        bScores(1);
        Assert.assertEquals("Love Fifteen", tennis.score());
    }

    @Test
    public void When_0_2_Then_Love_Thirty() {
        bScores(2);
        Assert.assertEquals("Love Thirty", tennis.score());
    }

    @Test
    public void When_1_1_Then_Fifteen_All() {
        aScores(1);
        bScores(1);
        Assert.assertEquals("Fifteen All", tennis.score());
    }

    @Test
    public void When_3_3_Then_Deuce() {
        makeDeuce();
        Assert.assertEquals("Deuce", tennis.score());
    }

    private void makeDeuce() {
        aScores(3);
        bScores(3);
    }

    @Test
    public void When_4_3_Then_Player1_Adv() {
        makeDeuce();

        aScores(1);
        Assert.assertEquals("Kuma Adv", tennis.score());
    }

    @Test
    public void When_3_4_Then_Player2_Adv() {
        makeDeuce();

        bScores(1);
        Assert.assertEquals("Tom Adv", tennis.score());
    }

    private void bScores(int times) {
        for (int i = 0; i < times; i++) {
            tennis.b();

        }
    }

    private void aScores(int times) {
        for (int i = 0; i < times; i++) {
            tennis.a();

        }
    }


}
