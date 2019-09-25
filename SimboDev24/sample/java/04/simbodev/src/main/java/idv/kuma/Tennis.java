package idv.kuma;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class Tennis {

    private final static Map<Integer, String> scoreToShow = new HashMap<>();

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

        return afterDeuce()
                ? leadingPlayer() + getPostFix()
                : scoreToShow.get(aScore) + " " + scoreToShow.get(bScore);


    }


    private boolean sameScore() {
        return aScore == bScore;
    }


    private boolean afterDeuce() {
        return aScore >= 3 && bScore >= 3;
    }


    private String leadingPlayer() {
        return aScore > bScore
                ? aName
                : bName;
    }


    private String getPostFix() {
        return diffIsOne()
                ? " Adv"
                : " Wins";
    }


    private boolean diffIsOne() {
        return Math.abs(aScore - bScore) == 1;
    }


    public void a() {

        aScore++;

    }


    public void b() {
        bScore++;
    }
}
