package idv.kuma.game.vo;

public class Parameters {
    private String action;
    private double bet;

    public Parameters(String action, double bet) {
        this.action = action;
        this.bet = bet;
    }


    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
