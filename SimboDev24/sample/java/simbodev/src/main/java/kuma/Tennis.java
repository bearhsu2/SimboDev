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
    private String aName;
    private String bName;

    public Tennis(String aName, String bName) {
        this.aName = aName;
        this.bName = bName;
    }

    public String score() {

        if (aScore == bScore) {
            return aScore >= 3
                    ? "Deuce"
                    : scoreToShow.get(aScore) + " All";
        }


        if (Math.max(aScore, bScore) > 3) {

            return leadingPlayer() + " Adv";
        }
        return scoreToShow.get(aScore) + " " + scoreToShow.get(bScore);


    }

    private String leadingPlayer() {
        return aScore > bScore
                ? aName
                : bName;
    }

    public void a() {
        aScore++;
    }

    public void b() {
        bScore++;
    }
}