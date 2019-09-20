import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private static Map<Integer, String> scoreLookup = new HashMap<>();

    static {
        scoreLookup.put(0, "Love");
        scoreLookup.put(1, "Fifteen");
        scoreLookup.put(2, "Thirty");
        scoreLookup.put(3, "Forty");
    }

    private int aScore = 0;
    private int bScore = 0;

    public String score() {
        if (aScore != bScore) {
            return scoreLookup.get(aScore) + " " + scoreLookup.get(bScore);
        }
        if (aScore > 0) {
            return "Fifteen All";
        }
        return "Love All";
    }

    public void firstPlayerHit() {
        this.aScore++;
    }

    public void bHit() {
        this.bScore++;
    }
}
