package idv.kuma.game.vo;

public class User {

    private boolean initialized;
    private String gameType;
    private double balance;

    public User(String gameType, double balance) {
        this.gameType = gameType;
        this.balance = balance;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
