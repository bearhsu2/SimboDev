package idv.kuma;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TennisTest {


    private final Tennis tennis;


    public TennisTest() {
        tennis = new Tennis("Kuma", "Tom");
    }


    @Test
    public void When_3_5_Tom_Wins() {
        makeDeuce();
        bScores(2);
        runAndCheck("Tom Wins");
    }


    private void makeDeuce() {
        aScores(3);
        bScores(3);
    }


    private void bScores(int times) {
        for (int i = 0; i < times; i++) {

            tennis.b();
        }
    }


    private void runAndCheck(String expect) {
        Assert.assertEquals(expect, tennis.score());
    }


    private void aScores(int times) {
        for (int i = 0; i < times; i++) {
            tennis.a();
        }
    }


    @Test
    public void When_3_4_Tom_Adv() {
        makeDeuce();
        bScores(1);
        runAndCheck("Tom Adv");
    }


    @Test
    public void When_4_3_Kuma_Adv() {
        makeDeuce();
        aScores(1);
        runAndCheck("Kuma Adv");
    }


    @Test
    public void When_3_3_Then_Deuce() {
        makeDeuce();
        runAndCheck("Deuce");
    }


    @Test
    public void When_2_2_Then_Thirty_All() {
        aScores(2);
        bScores(2);
        runAndCheck("Thirty All");
    }


    @Test
    public void When_1_1_Then_Fifteen_All() {
        aScores(1);
        bScores(1);
        runAndCheck("Fifteen All");
    }


    @Test
    public void When_0_2_Then_Love_Thirty() {
        bScores(2);
        runAndCheck("Love Thirty");
    }


    @Test
    public void When_0_1_Then_Love_Fifteen() {
        bScores(1);
        runAndCheck("Love Fifteen");
    }


    @Test
    public void When_3_0_Then_Forty_Love() {
        aScores(3);
        runAndCheck("Forty Love");
    }


    @Test
    public void When_2_0_Then_Thirty_Love() {
        aScores(2);
        runAndCheck("Thirty Love");
    }


    @Test
    public void When_1_0_Then_Fifteen_Love() {
        aScores(1);
        runAndCheck("Fifteen Love");
    }


    @Test
    public void When_0_0_Then_Love_All() {
        runAndCheck("Love All");
    }
}
