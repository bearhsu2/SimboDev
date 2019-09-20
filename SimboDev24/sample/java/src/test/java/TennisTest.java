import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    private Tennis tennis;

    @Test
    public void when_3_0_Forty_Love() {
        firstPlayerHit(3);
        check("Forty Love");
    }

    @Test
    public void when_0_2_Love_Thirty() {
        secondPlayerHit(2);
        check("Love Thirty");
    }

    private void secondPlayerHit(int times) {
        for (int j = 0; j < times; j++) {
            tennis.bHit();
        }
    }

    @Test
    public void when_1_1_Fifteen_All() {
        firstPlayerHit(1);
        secondPlayerHit(1);
        check("Fifteen All");
    }

    @Test
    public void when_0_1_Love_Fifteen() {
        secondPlayerHit(1);
        check("Love Fifteen");
    }

    @Test
    public void when_2_0_Thirty_Love() {
        firstPlayerHit(2);
        check("Thirty Love");
    }

    @Test
    public void when_1_0_Fifteen_Love() {
        firstPlayerHit(1);
        check("Fifteen Love");
    }

    private void firstPlayerHit(int times) {
        for (int i = 0; i < times; i++) {
            tennis.firstPlayerHit();
        }
    }

    @Test
    public void init_then_Love_All() {
        check("Love All");
    }

    private void check(String expectedScore) {
        assertEquals(expectedScore, tennis.score());
    }

    @Before
    public void setUp() {
        tennis = new Tennis();
    }
}