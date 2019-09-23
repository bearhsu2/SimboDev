package kuma;

public class Tennis {

    int aScore;

    public String score() {
        if (aScore > 0) {
            return "Fifteen Love";
        }
        return "Love All";
    }

    public void a() {
        aScore++;
    }
}