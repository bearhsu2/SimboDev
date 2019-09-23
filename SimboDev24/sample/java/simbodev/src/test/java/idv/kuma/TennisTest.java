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
        tennis.a();
        check("Fifteen Love");
    }
    @Test
    public void When_aa_Then_Forty_Love() {
        tennis.a();
        tennis.a();
        check("Forty Love");
    }




    private void check(String s) {
        Assert.assertEquals(s, tennis.score());
    }
}