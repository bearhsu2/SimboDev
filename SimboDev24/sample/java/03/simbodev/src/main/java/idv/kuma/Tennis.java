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
    private String bName;
    private String aName;

    public Tennis(String aName, String bName) {
        this.aName = aName;
        this.bName = bName;
    }

    public String score() {

        if (aScore == bScore) {

            if (afterDeuce()) {
                return "Deuce";
            }
            return scoreToShow.get(aScore) + " All";
        }


        if (afterDeuce()) {
            return leadingPlayer() + profix();
        }

        return scoreToShow.get(aScore) + " " + scoreToShow.get(bScore);


    }

    private String profix() {
        return diffIsOne()
                ? " Adv"
                : " Wins";
    }

    private boolean afterDeuce() {
        return aScore >= 3 && bScore >= 3;
    }

    private boolean diffIsOne() {
        return Math.abs(aScore - bScore) == 1;
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
