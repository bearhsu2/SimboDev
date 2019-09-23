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
        Assert.assertEquals("Love All", tennis.score());
    }


    @Test
    public void When_a_Then_Fifteen_Love() {
        tennis.a();
        Assert.assertEquals("Fifteen Love", tennis.score());
    }
}