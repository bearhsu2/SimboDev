package idv.kuma;

import kuma.Tennis;
import org.junit.Assert;
import org.junit.Test;

public class TennisTest {

    @Test
    public void When_Init_Then_Love_All() {
        Tennis tennis = new Tennis();
        Assert.assertEquals("Love All", tennis.score());
    }


    @Test
    public void When_a_Then_Fifteen_Love() {
        Tennis tennis = new Tennis();
        tennis.a();
        Assert.assertEquals("Fifteen Love", tennis.score());
    }
}