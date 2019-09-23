package kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreToShow = new HashMap<>();

    static {
        scoreToShow.put(1, "Fifteen");
        scoreToShow.put(2, "Thirty");
        scoreToShow.put(3, "Forty");
    }

    private int aScore;
    private int bScore;

    public String score() {
        if (aScore > 0) {
            return scoreToShow.get(aScore) + " Love";
        }

        if (bScore > 0) {
            return "Love " + scoreToShow.get(bScore);
        }

        return "Love All";
    }

    public void a() {
        aScore++;
    }

    public void b() {
        bScore++;
    }
}