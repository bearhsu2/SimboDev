package idv.kuma;

import kuma.Tennis;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisTest {

    private Tennis tennis;

    @Before
    public void setUp() throws Exception {
        tennis = new Tennis();

    }

    @Test
    public void When_Init_Then_Love_All() {
        check("Love All");
    }


    @Test
    public void When_a_Then_Fifteen_Love() {
        aGetsPoints(1);
        check("Fifteen Love");
    }

    @Test
    public void When_aa_Then_Thirty_Love() {
        aGetsPoints(2);
        check("Thirty Love");
    }


    @Test
    public void When_aaa_Then_Forty_Love() {
        aGetsPoints(3);
        check("Forty Love");
    }

    @Test
    public void When_b_Then_Love_Fifteen() {
        bGetsPoints(1);
        check("Love Fifteen");
    }


    @Test
    public void When_bb_Then_Love_Thirty() {
        bGetsPoints(2);
        check("Love Thirty");
    }

    @Test
    public void When_ab_Then_Fifteen_All() {
        aGetsPoints(1);
        bGetsPoints(1);
        check("Fifteen All");
    }





    private void bGetsPoints(int times) {
        for (int i = 0; i < times; i++) {
            tennis.b();
        }
    }

    private void aGetsPoints(int times) {
        for (int i = 0; i < times; i++) {
            tennis.a();
        }
    }


    private void check(String s) {
        Assert.assertEquals(s, tennis.score());
    }
}