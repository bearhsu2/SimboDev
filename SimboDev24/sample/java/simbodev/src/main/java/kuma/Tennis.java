package kuma;

import java.util.HashMap;
import java.util.Map;

public class Tennis {

    private static Map<Integer, String> scoreToShow = new HashMap<>();

    static {
        scoreToShow.put(0, "Love");
        scoreToShow.put(1, "Fifteen");
        scoreToShow.put(2, "Thirty");
        scoreToShow.put(3, "Forty");
    }

    private int aScore;
    private int bScore;

    public String score() {

        if (aScore == bScore) {

            return aScore >= 3
                    ? "Deuce"
                    : scoreToShow.get(aScore) + " All";
        }


        return scoreToShow.get(aScore) + " " + scoreToShow.get(bScore);


    }

    public void a() {
        aScore++;
    }

    public void b() {
        bScore++;
    }
}