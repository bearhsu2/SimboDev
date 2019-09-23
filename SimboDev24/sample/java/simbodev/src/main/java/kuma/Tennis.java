package kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreToShow = new HashMap<>();
    static {
        scoreToShow.put(1, "Fifteen");
        scoreToShow.put(2, "Forty");
    }

    int aScore;

    public String score() {
        if (aScore > 0) {
            return scoreToShow.get(aScore) + " Love";
        }
        return "Love All";
    }

    public void a() {
        aScore++;
    }
}