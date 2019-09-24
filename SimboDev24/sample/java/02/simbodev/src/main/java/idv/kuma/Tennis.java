package idv.kuma;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
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

        if (sameScore()) {
            return afterDeuce()
                    ? "Deuce"
                    : scoreToShow.get(aScore) + " All";
        }

        if (afterDeuce()) {
            return leadingPlayer() + (
                    diffMoreThanOne()
                            ? " Wins"
                            : " Adv"
            );
        }

        return scoreToShow.get(aScore) + " " + scoreToShow.get(bScore);


    }

    private boolean diffMoreThanOne() {
        return Math.abs(aScore - bScore) > 1;
    }

    private String leadingPlayer() {
        return aScore > bScore
                ? aName
                : bName;
    }

    private boolean sameScore() {
        return aScore == bScore;
    }

    private boolean afterDeuce() {
        return aScore >= 3 && bScore >= 3;
    }

    public void a() {
        aScore++;
    }

    public void b() {
        bScore++;
    }
}
