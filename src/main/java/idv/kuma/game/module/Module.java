package idv.kuma.game.module;

public interface Module {

    void doInit();

    void doSpin(double bet);

    void doLuckyBall(double bet);

    void checkUser();

    void checkBet(double bet);

    void checkBalance(double bet);


}
