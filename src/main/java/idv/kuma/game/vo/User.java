package idv.kuma.game.vo;

import idv.kuma.game.module.Module;
import idv.kuma.game.module.ModuleFactory;

public class User {

    private boolean initialized;
    private String gameType;
    private double balance;
    private Module module;

    public User(String gameType, double balance) {
        this.gameType = gameType;
        this.module = ModuleFactory.create(gameType, this);
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

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
