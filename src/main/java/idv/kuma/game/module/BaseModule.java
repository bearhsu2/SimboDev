package idv.kuma.game.module;

import idv.kuma.game.code.ReturnCode;
import idv.kuma.game.exception.GamePlayRuntimeException;
import idv.kuma.game.vo.User;

public abstract class BaseModule implements Module {

    User user;
    double rtp;

    public BaseModule(User user) {
        this.user = user;
    }

    @Override
    public void doInit() {
        if (user.isInitialized()) {
            throw new GamePlayRuntimeException(ReturnCode.DUPLICATED_INITIALIZATION);
        } else {
            user.setInitialized(true);
        }
    }

    @Override
    public void doSpin(double bet) {

        checkUser();
        checkBet(bet);
        checkBalance(bet);

        double returnAmount = rtp * bet;
        double newBalance = user.getBalance() - bet + returnAmount;
        user.setBalance(newBalance);

    }

    @Override
    public void checkUser() {
        if (!user.isInitialized())
            throw new GamePlayRuntimeException(ReturnCode.UNINITIALIZED_PLAY);
    }

    @Override
    public void checkBet(double bet) {
        if (bet <= 0)
            throw new GamePlayRuntimeException(ReturnCode.NON_POSITIVE_BET);
    }

    @Override
    public void checkBalance(double bet) {
        if (user.getBalance() < bet)
            throw new GamePlayRuntimeException(ReturnCode.INSUFFICIENT_BALANCE);
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getRtp() {
        return rtp;
    }

    public void setRtp(double rtp) {
        this.rtp = rtp;
    }
}
